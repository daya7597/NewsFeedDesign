package com.newsfeed.command;

import java.io.BufferedReader;
import java.io.IOException;

import com.newsfeed.service.createUserService;

public class SignUpCommand implements Command {
	createUserService createUserService = new createUserService();
	
	@Override
	public void execute(BufferedReader br) {
		// TODO Auto-generated method stub
//		System.out.println("Signup Executed");
		
		try {
			createUserService.createUser(br);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
