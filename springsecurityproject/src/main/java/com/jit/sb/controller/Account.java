package com.jit.sb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Account {

	@GetMapping("/account")
	public String getAccount() {
		return "This is Account Controller ";
	}
}
