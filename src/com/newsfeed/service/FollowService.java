package com.newsfeed.service;

import com.newsfeed.exception.UserNotFoundException;
import com.newsfeed.models.NewsFeedApp;
import com.newsfeed.models.User;
import com.newsfeed.repositories.exception.SameUserIdException;
import com.newsfeed.repositories.users.UserRepository;

public class FollowService {
	UserRepository repository;
	public void follow(int userId) throws SameUserIdException, UserNotFoundException {
		if(NewsFeedApp.getUser().getId() == userId) {
			throw new SameUserIdException();
		}
		
		User u = repository.findUserByUserId(userId);
		
		if(u==null) {
			throw new UserNotFoundException();
		}
		
		u.getFollowedByUsers().add(NewsFeedApp.getUser());
	}
}
