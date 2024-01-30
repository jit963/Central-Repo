package com.jit.sb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Notices {

	@GetMapping("/notices")
	public String getNotices() {
		return "This is Notices Controller ";
	}
}
