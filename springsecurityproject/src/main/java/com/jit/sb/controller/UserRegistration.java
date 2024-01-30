package com.jit.sb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jit.sb.bean.UserDto;
import com.jit.sb.service.UserService;

@RestController
@RequestMapping("/api/")
public class UserRegistration {
	@Autowired
	private UserService userService;

	@PostMapping("/user")
	public ResponseEntity<UserDto> registerUser(@RequestBody UserDto userDto) {
		UserDto savedUserDto = null;
		ResponseEntity<UserDto> response = null;

		savedUserDto = userService.registerUser(userDto);
		if (savedUserDto.getId() > 0)
			response = new ResponseEntity<UserDto>(savedUserDto, HttpStatus.CREATED);

		return response;
	}
}
