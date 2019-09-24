package br.com.bandtec.AgendaDeObjetivos.controller;

import br.com.bandtec.AgendaDeObjetivos.model.Credential;
import br.com.bandtec.AgendaDeObjetivos.model.User;
import br.com.bandtec.AgendaDeObjetivos.resources.TodosUsuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
	
    private TodosUsuarios todosUsuarios;
    
    @Autowired
    public LoginController(TodosUsuarios todosUsuarios) {
        this.todosUsuarios = todosUsuarios;
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody Credential credential) {
        if(todosUsuarios.existe(credential) == null) {
            return ResponseEntity
                    .status(HttpStatus.UNAUTHORIZED)
                    .body("Erro");
        }
        return ResponseEntity.ok("Sucesso!");
    }

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody User user) {
        todosUsuarios.save(user);
        return ResponseEntity.ok("Sucesso!");
    }
}
