package com.newsfeed.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Date;

import com.newsfeed.models.NewsFeedApp;
import com.newsfeed.models.Post;
import com.newsfeed.models.PostDTO;
import com.newsfeed.repositories.posts.PostRepository;

public class PostService {
	public void createPost(BufferedReader br) throws IOException {
		PostDTO dto = new PostDTO();
		System.out.println("Create your Post : ");
		dto.setNewsFeed(br.readLine());
		dto.setUser(NewsFeedApp.getUser());
		dto.setCreatedOn(new Date());
		
		Post p = new Post.PostBuilder().setPost(dto).build();
		PostRepository.postRepository.add(p);
		
		System.out.println(p);
	}
}
