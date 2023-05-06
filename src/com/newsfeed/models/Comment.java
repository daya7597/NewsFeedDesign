package com.newsfeed.models;

import java.util.Date;

import com.newsfeed.models.Post.PostBuilder;

public class Comment {
	private int id;
	private Post post;
	private User commentedBy;
	private Date commentedOn;
	
	public Comment(int id, Post post, User commentedBy, Date commentedOn) {
		super();
		this.id = id;
		this.post = post;
		this.commentedBy = commentedBy;
		this.commentedOn = new Date();
	}
	
	public static class CommentBuilder{
		private static int generatedId;
		private Post post;
		private User commentedBy;
		private Date commentedOn;
		
		public CommentBuilder setComment(CommentDTO commentDTO) {
			generatedId++;
			this.post = commentDTO.getPost();
			this.commentedBy = commentDTO.getCommentedBy();
			this.commentedOn = commentDTO.getCommentedOn();
			return this;
		}
		
		public Comment build() {
			Comment c = new Comment(generatedId, this.post, this.commentedBy, this.commentedOn);
			return c;
		}
	}
}
