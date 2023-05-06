package com.newsfeed.command;

import java.io.BufferedReader;
import java.io.IOException;

import com.newsfeed.service.PostService;

public class PostCommand implements Command {
	PostService postService = new PostService();
	
	@Override
	public void execute(BufferedReader br) {
		// TODO Auto-generated method stub
//		System.out.println("Post executed");
		try {
			postService.createPost(br);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

}
