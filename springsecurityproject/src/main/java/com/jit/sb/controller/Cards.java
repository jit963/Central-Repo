package com.jit.sb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Cards {
 
	@GetMapping("/cards")
	public String getCards() {
		return "This is Cards Controller ";
	}
}
