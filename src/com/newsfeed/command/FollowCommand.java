package com.newsfeed.command;

import java.io.BufferedReader;
import java.io.IOException;

import com.newsfeed.exception.UserNotFoundException;
import com.newsfeed.repositories.exception.SameUserIdException;
import com.newsfeed.service.FollowService;

public class FollowCommand implements Command {
	FollowService followService = new FollowService();
	@Override
	public void execute(BufferedReader br) throws SameUserIdException, UserNotFoundException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Enter User Id : ");
		
		followService.follow(br.read());
	}

}
