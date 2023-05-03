package com.scaler.service.impl;

import java.io.BufferedReader;
import java.io.IOException;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scaler.entities.User;
import com.scaler.payloads.UserDTO;
import com.scaler.services.UserSignUpService;

@Service("MyService")
public class UserSignUpServiceImpl implements UserSignUpService{
	@Autowired
	private ModelMapper mapper;
	
	@Override
	public UserDTO createUser(UserDTO dto) {
		User user = this.DTOtoUser(dto);
		// TODO Auto-generated method stub
		System.out.println("User Added");
		return dto;
	}

	public UserDTO UsertoDTO(User user) {
		return mapper.map(user, UserDTO.class);
	}
	
	public User DTOtoUser(UserDTO dto) {
		return mapper.map(dto, User.class);
	}

	@Override
	public UserDTO UserInput(BufferedReader br) throws IOException {
		// TODO Auto-generated method stub
		UserDTO dto = new UserDTO();
		dto.takeUserInput(br);
		return dto;
	}
}
