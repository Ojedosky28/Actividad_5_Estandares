package co.edu.uniminuto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.edu.uniminuto.entity.UsersData;
import co.edu.uniminuto.service.UserServiceI;

@RestController
@RequestMapping(value = "conuse")
public class UserController {

	@Autowired

	UserServiceI service;

	@GetMapping(value = "users"/* , produces = MediaType. */)

	public List<UsersData> getAllUsersData() {
		return service.listAllUsers();
	}

	@GetMapping(value = "users-id")
	public UsersData getByUsersData(@RequestParam("id") int userId) {
		return service.findByIdUser(userId);
	}

	@GetMapping(value = "users-doc")
	public UsersData getByUsersDoc(@RequestParam("document") String userDocument) {
		return service.findIdByDocument(userDocument);
	}

	@GetMapping(value = "users-email")
	public UsersData getByUsersEmail(@RequestParam("email") String email) {
		return service.findByIdEmail(email);
	}

	@PostMapping(value = "users")
	public UsersData postUser(@RequestBody UsersData user) {
		return service.addtUser(user);
	}

	@PutMapping(value = "users")
	public UsersData putUser(@RequestBody UsersData user) {
		return service.addtUser(user);

	}
}
