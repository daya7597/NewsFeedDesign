package com.newsfeed.service;

import java.io.BufferedReader;
import java.io.IOException;

import com.newsfeed.models.User;
import com.newsfeed.models.UserDTO;
import com.newsfeed.repositories.users.UserRepository;

public class createUserService {
	
	public void createUser(BufferedReader br) throws IOException {
		UserDTO userDTO = new UserDTO();
		System.out.println("Enter First Name : ");
		userDTO.setFirstname(br.readLine());
		System.out.println("Enter Last Name : ");
		userDTO.setLastname(br.readLine());
		System.out.println("Enter User Name : ");
		userDTO.setUsername(br.readLine());
		System.out.println("Enter Password : ");
		userDTO.setPassword(br.readLine());
		
		User u = new User.Builder().setUser(userDTO).build();
		UserRepository.userList.add(u);
//		System.out.println("User created : "+u);
	}
}
