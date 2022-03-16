package com.appsdevelopmentblog.apps.ws.ui.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users") /* This will start with users 
because it will be used in user operations. The URL will thus
be http://localhost:8080/users/{then the method that will be used} */
public class UserController {
	
	@GetMapping
	public String getUser() {
		return "User data was fetched";
	}
	
	@PostMapping
	public String createUser() {
		return "User is created";
	}
	
	@PutMapping
	public String updateUser() {
		return "User is updated";
	}
	
	@DeleteMapping
	public String deleteUser() {
		return "User is deleted";
	}
}
