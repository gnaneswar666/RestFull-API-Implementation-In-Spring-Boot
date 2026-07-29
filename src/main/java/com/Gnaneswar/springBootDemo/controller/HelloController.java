package com.Gnaneswar.springBootDemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.Resource;

@RestController
 
public class HelloController {

	@Value("${welcome.message}")
	private String WelcomeMessage;
	
	//@RequestMapping(value = "/",method =RequestMethod.GET )
	@GetMapping("/")
	public String helloWorld() {
		return WelcomeMessage;
	}
	
	
}
