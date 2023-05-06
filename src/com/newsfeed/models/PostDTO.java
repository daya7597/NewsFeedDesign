package com.newsfeed.models;

import java.util.Date;

public class PostDTO {
	private String newsFeed;
	private User user;
	private Date createdOn;
	
	public String getNewsFeed() {
		return newsFeed;
	}
	public void setNewsFeed(String newsFeed) {
		this.newsFeed = newsFeed;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Date getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
}
