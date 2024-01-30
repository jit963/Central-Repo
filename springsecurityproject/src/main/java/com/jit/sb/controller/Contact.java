package com.jit.sb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Contact {

	@GetMapping("/contact")
	public String getContact() {
		return "This is Contact Controller ";
	}
}
