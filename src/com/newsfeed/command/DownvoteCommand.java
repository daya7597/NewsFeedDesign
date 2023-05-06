package com.newsfeed.command;

import java.io.BufferedReader;

public class DownvoteCommand implements Command{
	@Override
	public void execute(BufferedReader br) {
		// TODO Auto-generated method stub
		System.out.println("DownVote executed");
	}
}
