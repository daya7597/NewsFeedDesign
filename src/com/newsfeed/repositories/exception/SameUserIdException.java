package com.newsfeed.repositories.exception;

public class SameUserIdException extends Exception {
	public SameUserIdException() {
		// TODO Auto-generated constructor stub
		super("Same User found");
	}
}
