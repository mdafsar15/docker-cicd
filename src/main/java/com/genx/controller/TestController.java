package com.genx.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/genx")
public class TestController {

	
	
	@GetMapping("/")
	public String get() {
		return "Welcome to genx";
	}
}
