package br.com.bandtec.AgendaDeObjetivos.controller;

import br.com.bandtec.AgendaDeObjetivos.model.User;
import br.com.bandtec.AgendaDeObjetivos.model.Objetivo;
import br.com.bandtec.AgendaDeObjetivos.model.resources.TodosObjetivos;
import java.time.LocalDate;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ObjetivosController {
    
    private TodosObjetivos todosObjetivos;
    
    @Autowired
    public ObjetivosController(TodosObjetivos todosObjetivos) {
        this.todosObjetivos = todosObjetivos;
    }
    
    @PostMapping("/objetivos")
    public ResponseEntity<String> insertObjetivo(@RequestBody Objetivo objetivo) {
        try {
            this.todosObjetivos.save(objetivo);
            return ResponseEntity.ok("Sucesso!");
        }
        catch (Exception e) {
            return ResponseEntity.unprocessableEntity().body("Erro ao processar o pedido.");
        }
    }
    
    @GetMapping("/objetivos/data/{date}")
    public ResponseEntity<List<Objetivo>> listObjetivoByDate(@PathVariable("date") String date) {
        
        List<Objetivo> objetivosList = this.todosObjetivos.ate(LocalDate.parse(date));
        if (objetivosList.isEmpty()) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(objetivosList);
        }
    }
}
