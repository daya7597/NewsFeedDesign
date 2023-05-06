package com.newsfeed.command;

import java.io.BufferedReader;
import java.io.IOException;

import com.newsfeed.exception.UserNotFoundException;
import com.newsfeed.repositories.exception.SameUserIdException;

public interface Command {
	public void execute(BufferedReader br) throws SameUserIdException, UserNotFoundException, IOException;
}
