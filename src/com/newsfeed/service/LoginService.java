package com.newsfeed.service;

import java.io.BufferedReader;
import java.io.IOException;

import com.newsfeed.exception.LoginException;
import com.newsfeed.models.NewsFeedApp;
import com.newsfeed.models.User;
import com.newsfeed.repositories.users.UserRepository;

public class LoginService {
	UserRepository repository = new UserRepository();
	
	public void login(BufferedReader br) throws IOException, LoginException  {
		System.out.println("Enter Username : ");
		String username = br.readLine();
		System.out.println("Enter Password : ");
		String password = br.readLine();
		
		User u = repository.findUserByUsernameAndPassword(username, password);
		if(u == null) {
			throw new LoginException();
		}
		
		NewsFeedApp.setIsLoggedIn(true);
		NewsFeedApp.generateSessionId();
		NewsFeedApp.setUser(u);
	}
}
