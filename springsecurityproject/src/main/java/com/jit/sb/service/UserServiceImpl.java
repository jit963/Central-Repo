package com.jit.sb.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jit.sb.bean.UserDto;
import com.jit.sb.entity.User;
import com.jit.sb.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public UserDto registerUser(UserDto userDto) {
		User user=modelMapper.map(userDto, User.class);
		User savedUserEntity=userRepository.save(user);
		UserDto savedUserDto=modelMapper.map(savedUserEntity, UserDto.class);
		return savedUserDto;
	}
	
}
