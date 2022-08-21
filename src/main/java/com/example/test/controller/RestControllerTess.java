package com.example.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerTess {

	@GetMapping("/")
	public String test() {
		return "Hello Test App";
	}
}
