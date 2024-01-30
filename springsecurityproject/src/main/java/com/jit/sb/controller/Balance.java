package com.jit.sb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Balance {

	@GetMapping("/balance")
	public String getBalance() {
		return "This is Balance Controller ";
	}
}
