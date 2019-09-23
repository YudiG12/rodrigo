//package br.com.bandtec.AgendaDeObjetivos.controller;
//
//import br.com.bandtec.AgendaDeObjetivos.model.Credential;
//import static org.junit.Assert.assertEquals;
//
//import org.junit.Before;
//import org.junit.Test;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//
//public class LoginControllerTest {
//
//	private LoginController controller;
//
//	@Before
//	public void setup() {
//		controller = new LoginController();
//	}
//
//	@Test
//	public void login_loginAndPasswordValid_returnsOK() {
//		ResponseEntity<String> response = this.controller.authenticateLogin(new Credential("admin","admin"));
//		assertEquals(HttpStatus.OK, response.getStatusCode());
//		assertEquals("Sucesso", response.getBody());
//	}
//
//	@Test
//	public void login_loginAndPasswordInvalid_returnsUNATHORIZED() {
//		ResponseEntity<String> response = this.controller.authenticateLogin(new Credential("admin","123"));
//		assertEquals(HttpStatus.UNAUTHORIZED, response.getStatusCode());
//		assertEquals("Erro", response.getBody());
//	}
//
//}
