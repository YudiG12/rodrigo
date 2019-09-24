package br.com.bandtec.AgendaDeObjetivos.controller;

import br.com.bandtec.AgendaDeObjetivos.model.Credential;
import static org.junit.Assert.assertEquals;

import br.com.bandtec.AgendaDeObjetivos.model.User;
import br.com.bandtec.AgendaDeObjetivos.resources.TodosUsuarios;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class LoginControllerTest {

	private LoginController controller;
    private TodosUsuarios todosUsuarios;

	@Before
	public void setup() {
	    todosUsuarios = Mockito.mock(TodosUsuarios.class);
		controller = new LoginController(todosUsuarios);
	}

	@Test
	public void login_loginAndPasswordValid_returnsOK() {
	    Credential c = new Credential("igual", "igual");
	    Mockito.when(todosUsuarios.existe(c)).thenReturn(new User(40l,"igual","igual"));
	    ResponseEntity<String> response = controller.login(c);
		assertEquals(HttpStatus.OK, response.getStatusCode());
		assertEquals("Sucesso!", response.getBody());
	}

	@Test
	public void login_loginAndPasswordInvalid_returnsUNATHORIZED() {
		ResponseEntity<String> response = this.controller.login(new Credential("admin","123"));
		assertEquals(HttpStatus.UNAUTHORIZED, response.getStatusCode());
		assertEquals("Erro", response.getBody());
	}

}
