package com.apigateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class conytroller {

	@GetMapping("/")
	public String hello() {
		return "hello";
	}
	
	@GetMapping("/get")
	public String helloi() {
		return "hello java";
	}
	
	
	
	
	
}
