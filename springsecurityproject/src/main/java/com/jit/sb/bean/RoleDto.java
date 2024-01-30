package com.jit.sb.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoleDto {
	private int id;
	private String username;
	private String roles;
    private UserDto user;

}
