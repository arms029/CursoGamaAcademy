package br.com.arms.spring01.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample")
public class HelloWorldController {
	
	@GetMapping("/ola")
	public ResponseEntity<String> ola(){
		return ResponseEntity.ok("hello world");
	}

	@PostMapping("/ola")
	public ResponseEntity<String> ola2(){
		return ResponseEntity.ok("hello world");
	}

	@GetMapping("/antonio")
	public String antonio() {
		return "{nome: \"Antonio\"}";
	}

}
