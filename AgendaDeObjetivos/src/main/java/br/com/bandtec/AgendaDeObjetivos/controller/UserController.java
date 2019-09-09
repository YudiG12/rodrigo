package br.com.bandtec.AgendaDeObjetivos.controller;

import br.com.bandtec.AgendaDeObjetivos.model.User;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	private List<User> users;

	public UserController() {
		this.users = listUsers();
	}

	@GetMapping("/users/name/{userName}")
	public ResponseEntity<List<User>> getUserByName(@PathVariable("userName") String name) {
		List<User> usersByName = new ArrayList<User>();
		for (User u : users) {
			if (u.getName().equals(name)) {
				usersByName.add(u);
			}
		}
		if (usersByName.isEmpty()) {
			return ResponseEntity.noContent().build();
		} else {
			return ResponseEntity.ok(usersByName);
		}
	}
	
	@GetMapping("/users/age/{userAge}")
	public ResponseEntity<List<User>> getUserByAge(@PathVariable("userAge") int age) {
		List<User> usersByAge = new ArrayList<User>();
		for (User u : users) {
			if (u.getAge() == age) {
				usersByAge.add(u);
			}
		}
		if (usersByAge.isEmpty()) {
			return ResponseEntity.noContent().build();
		} else {
			return ResponseEntity.ok(usersByAge);
		}
	}

	public List<User> listUsers() {
		ArrayList<User> users = new ArrayList<User>();
		users.add(new User("Rodrigo", 29));
		users.add(new User("Rodrigo", 30));
		users.add(new User("Yudi", 19));
		return users;
	}
	
	@PostMapping("/users")
	public ResponseEntity<User> insertUser(@RequestBody User user) {
		this.users.add(user);
		return ResponseEntity.ok(user);
	}

}
