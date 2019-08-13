package br.com.bandtec.AgendaDeObjetivos.controller;

import org.springframework.http.ResponseEntity;

public class LoginController {
	
	public ResponseEntity<String> authenticateLogin(Credentials credentials) {
		if ((credentials.getLogin() == "admin" && credentials.getPassword() == "123")
			|| (credentials.getLogin() == "admin2" && credentials.getPassword() == "123")
			|| (credentials.getLogin() == "admin3" && credentials.getPassword() == "123")) {
			return ResponseEntity.ok("Sucesso");
		} else {
			return ResponseEntity.of(null);
		}
	}
	
}
