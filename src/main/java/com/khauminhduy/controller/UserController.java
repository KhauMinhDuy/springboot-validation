package com.khauminhduy.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.khauminhduy.model.User;
import com.khauminhduy.service.UserService;

@RestController
@RequestMapping("/api/")
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("users")
	public List<User> getUsers() {
		return userService.getAllUser();
	}
	
	@PostMapping("users")
	public User createUser(@Valid @RequestBody User user) {
		return userService.createUser(user);
	}
	
}
