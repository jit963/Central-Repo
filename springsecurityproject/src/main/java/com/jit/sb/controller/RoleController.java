package com.jit.sb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jit.sb.bean.RoleDto;
import com.jit.sb.service.RoleService;

@RestController
@RequestMapping("/api/")
public class RoleController {

	@Autowired
	private RoleService roleService;
	
	@PostMapping("/user/{userId}/roles")
	public ResponseEntity<RoleDto> createRole(@PathVariable("userId") int userId, @RequestBody RoleDto roleDto) {
		RoleDto saveRoleDto=roleService.createRole(userId, roleDto);
		return new ResponseEntity<RoleDto>(saveRoleDto,HttpStatus.CREATED);

	}
}
