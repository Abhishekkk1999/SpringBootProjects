package com.apigateway.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.apigateway.jwt.SecurityUtils;
import com.apigateway.model.Model;
import com.apigateway.repository.SecurityRepository;
import com.apigateway.security.SecurityDetails;

@RestController
public class loginController {
	
	@Autowired
	SecurityRepository repo;
	
	@Autowired
	AuthenticationManager authmanager;
	
	@Autowired
	SecurityUtils utils;

	@PostMapping("/register")
	public String Register(@RequestBody Model model) {
		
		BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
		String pass=encoder.encode(model.getPassword());
		model.setPassword(pass);
		repo.save(model);
		
		return "Registration Successful";
		
	}
	
	@PostMapping("/login")
	public String login(@RequestBody Model model) {
		try {
			Authentication auth=authmanager
					.authenticate(new UsernamePasswordAuthenticationToken(model.getUsername(),model.getPassword()));
			
			if(auth.isAuthenticated()) {
				SecurityDetails details=new SecurityDetails(model);
				return utils.generatetoken(details);
			}
		}
		catch(Exception e) {
			return e.toString();
		}
		
		return "";
	}
}
