package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //indica que essa class vai ser controladora
@RequestMapping("/helloworld") //indica o endereço dessa class controladora
public class HelloController {
	@GetMapping
	public String hello() {
		return "Alô Alô Marciano!";
	}
}
