package com.newsfeed.repositories.users;

import java.util.ArrayList;
import java.util.List;

import com.newsfeed.models.NewsFeedApp;
import com.newsfeed.models.User;
import com.newsfeed.repositories.exception.SameUserIdException;

public class UserRepository {
	public static List<User> userList = new ArrayList<>();
	
	public User findUserByUsernameAndPassword(String username, String password) {
		for(User user : userList) {
			if(user.getUsername().equals(username) &&
			   user.getPassword().equals(password)) {
				return user;
			}
		}
		return null;
	}
	
	public User findUserByUserId(int userId) throws SameUserIdException {
		
		for(User user : userList) {
			if(user.getId() == userId) {
				return user;
			}
		}
		
		return null;		
	}
}
