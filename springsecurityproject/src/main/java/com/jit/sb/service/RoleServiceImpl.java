package com.jit.sb.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jit.sb.bean.RoleDto;
import com.jit.sb.entity.Role;
import com.jit.sb.entity.User;
import com.jit.sb.repository.RoleRepository;
import com.jit.sb.repository.UserRepository;

@Service
public class RoleServiceImpl implements RoleService {
	
	@Autowired
	private RoleRepository roleRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public RoleDto createRole(int userId, RoleDto roleDto) {
		User user=userRepository.findById(userId).get();
		Role role=modelMapper.map(roleDto, Role.class);
		role.setUser(user);
		
		Role saveRoleEntity=roleRepository.save(role);
		
		RoleDto savedRoleDto=modelMapper.map(saveRoleEntity, RoleDto.class);
		return savedRoleDto;
	}

}
