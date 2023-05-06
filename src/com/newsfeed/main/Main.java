package com.newsfeed.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.newsfeed.command.Command;
import com.newsfeed.exception.NotLoggedInException;
import com.newsfeed.factories.generateCommandFactory;
import com.newsfeed.models.NewsFeedApp;
import com.newsfeed.repositories.posts.PostRepository;
import com.newsfeed.repositories.users.UserRepository;

public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		
		while(true) {
			if(NewsFeedApp.getIsLoggedIn()) {
				System.out.println("Welcome to NewsFeedApp : " + NewsFeedApp.getUser().getFirstname());
			}
			String command = br.readLine();
			
			if(command.equals("exit")) {
				break;
			}
			Command c;
			try {
				c = generateCommandFactory.createFactory(command);
				c.execute(br);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
			System.out.println(UserRepository.userList);
			System.out.println(PostRepository.postRepository);
		}
		
		
		
	}
}
