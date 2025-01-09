package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teste")
public class TesteController {
	@Value("${openai.api.key}")
	private String KEY;
	
	@GetMapping("/teste")
	public String teste() {
		return KEY;
	}
}
