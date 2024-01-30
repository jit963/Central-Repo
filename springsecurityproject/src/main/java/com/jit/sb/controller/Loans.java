package com.jit.sb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Loans {

	@GetMapping("/loans")
	public String getLoans() {
		return "This is Loans Controller ";
	}
}
