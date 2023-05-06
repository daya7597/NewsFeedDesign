package com.newsfeed.command;

import java.io.BufferedReader;
import java.io.IOException;

import com.newsfeed.service.LoginService;

public class LoginCommand implements Command{
	LoginService loginService = new LoginService();
	
	@Override
	public void execute(BufferedReader br) {
		// TODO Auto-generated method stub
//		System.out.println("Login Executed");
		
		try {
			loginService.login(br);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

}
