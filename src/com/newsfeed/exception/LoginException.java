package com.newsfeed.exception;

public class LoginException extends Exception {
	public LoginException() {
		// TODO Auto-generated constructor stub
		super("Username and password did not match");
	}
}
