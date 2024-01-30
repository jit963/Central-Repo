package com.jit.sb.bean;

import java.util.HashSet;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
	private int id;
	private String username;
	private String password;
	private boolean enabled;
	// private Set<RoleDto> role= new HashSet<>();
}
