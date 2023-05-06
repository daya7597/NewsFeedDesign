package com.newsfeed.models;

import java.util.ArrayList;
import java.util.List;

public class NewsFeedApp {
	private static int sessionId;
	private static boolean isLoggedIn;
	private static User user;
	
	public static void setIsLoggedIn(boolean loginVal){
		isLoggedIn = loginVal;
	}
	
	public static boolean getIsLoggedIn(){
		return isLoggedIn;
	}
	
	public static void generateSessionId() {
		sessionId += 1;
	}
	
	public static int getSessionId() {
		return sessionId;
	}
	
	public static User getUser() {
		return user;
	}
	
	public static void setUser(User u) {
		user = u;
	}
	
	
}
