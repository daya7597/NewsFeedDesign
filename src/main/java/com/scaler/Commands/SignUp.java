package com.scaler.Commands;

import java.io.BufferedReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;

import com.scaler.services.UserSignUpService;

@ComponentScan(basePackages = "service.impl")
public class SignUp extends Command{

	@Autowired
	UserSignUpService userSignUpService;
	
	public SignUp(String command, BufferedReader br) {
		super(command, br);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void execute() throws IOException {
		// TODO Auto-generated method stub
		System.out.println(userSignUpService.UserInput(this.br));
	}

}
