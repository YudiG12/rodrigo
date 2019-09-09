package br.com.bandtec.AgendaDeObjetivos.controller;

import br.com.bandtec.AgendaDeObjetivos.model.Credential;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
	
	@PostMapping("/login")
	public ResponseEntity<String> authenticateLogin(@RequestBody Credential credentials) {
		if (credentials.getLogin().equals(credentials.getPassword())) {
			return ResponseEntity.ok("Sucesso");
		} else {
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Erro");
		}
	}
	
}
