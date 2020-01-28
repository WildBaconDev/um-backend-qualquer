package com.dmgoncalves.umbackendqualquer.rest.ola;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@PutMapping("/")
	public ResponseEntity<String> putBiruleibe(@RequestBody String birobiro) {
		System.out.println("putBiruleibe endpoint reached with some " + birobiro);
//		System.out.println("putBiruleibe endpoint reached with some " + dragon);
		
		return new ResponseEntity<>("Base endpoint response: " + birobiro + "PLUS THIS SHIT MOTHAFUCA -> KATCHAU", HttpStatus.OK);
	}
}