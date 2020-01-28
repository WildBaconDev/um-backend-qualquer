package com.dmgoncalves.umbackendqualquer.rest.ola;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OlaREST {
	
	@GetMapping("/ola")
	public ResponseEntity<String> ola() {
		System.out.println("Ola endpoint reached");
		
		return new ResponseEntity<>("Ola endpoint", HttpStatus.OK);
	}
	
	@GetMapping("/")
	public ResponseEntity<String> base() {
		System.out.println("Base endpoint reached");
		
		return new ResponseEntity<>("Base endpoint", HttpStatus.OK);
	}
}