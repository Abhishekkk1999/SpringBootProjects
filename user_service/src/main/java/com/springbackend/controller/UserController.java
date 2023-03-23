package com.springbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.springbackend.Model.User;
import com.springbackend.Model.Contact;
import com.springbackend.service.UserService;
import java.util.List;

@RestController
@RequestMapping("/user")


public class UserController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private RestTemplate restTemplate;
	
	
	
	
	
	@GetMapping("/{userId}")
	public User getUser(@PathVariable("userId") Long userId) {
		User user =this.userService.getUser(userId);
		
		//http://localhost:9002/contact/user/1311
		
		@SuppressWarnings("unchecked")
		List<Contact> contacts = this.restTemplate.getForObject("http://ContactService/contact/user/" + userId,List.class);
		user.setContacts(contacts);
		return user;
	}

}
