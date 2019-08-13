package br.com.bandtec.AgendaDeObjetivos.controller;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class LoginControllerTest {

	private LoginController controller;
	
	@Before
	public void setup() {
		controller = new LoginController();
	}
	
	@Test
	public void login_loginAndPasswordValid_returnStatusCode200() {
		ResponseEntity<String> response = controller.authenticateLogin(new Credentials("admin","1223"));
		assertEquals(HttpStatus.OK, response.getStatusCode());
		assertEquals("Sucesso", response.getBody());
	}
	
}
