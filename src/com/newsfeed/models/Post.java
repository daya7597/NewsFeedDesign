package com.newsfeed.models;

import java.util.Date;
import java.util.List;

public class Post {
	private int postId;
	private String newsFeed;
	private User user;
	private Date createdOn;
	private List<Comment> comments;
	
	private int upVote;
	private int downVote;
	private int score;
	
	public void setUpVote() {
		this.upVote++;
		setScore();
	}
	
	public void setDownVote() {
		this.downVote++;
		setScore();
	}
	
	public void setScore() {
		this.score = this.upVote - this.downVote;
	}
		
	private Post(int postId, String newsFeed, User user, Date createdOn) {
		super();
		this.postId = postId;
		this.newsFeed = newsFeed;
		this.user = user;
		this.createdOn = createdOn;
	}
	
	private String gettime(Date createdOn) {
		long time_difference = new Date().getTime() - createdOn.getTime(); 
        // Calucalte time difference in days  
        long days_difference = (time_difference / (1000*60*60*24)) % 365;   
        // Calucalte time difference in years  
        long years_difference = (time_difference / (1000l*60*60*24*365));   
        // Calucalte time difference in seconds  
        long seconds_difference = (time_difference / 1000)% 60;   
        // Calucalte time difference in minutes  
        long minutes_difference = (time_difference / (1000*60)) % 60;   
          
        // Calucalte time difference in hours  
        long hours_difference = (time_difference / (1000*60*60)) % 24; 
        
        String s = "";
        if(years_difference >= 1) {
        	s+=years_difference+" years";
        }else if(days_difference >= 1) {
        	s+= days_difference+" days";
        }else if(minutes_difference >= 1) {
        	s+=minutes_difference+" min";
        }else{
        	s+=seconds_difference+" sec";
        }
		
		return s;
	}

	@Override
	public String toString() {
		return "Feed_Id=" + postId + " posted " + gettime(createdOn) + " ago." ;
	}



	public static class PostBuilder{
		private static int generatedId;
		
		private String newsFeed;
		private User user;
		private Date createdOn;
		
		public PostBuilder setPost(PostDTO postDTO) {
			generatedId++;
			this.newsFeed = postDTO.getNewsFeed();
			this.user = postDTO.getUser();
			this.createdOn = postDTO.getCreatedOn();
			return this;
		}
		
		public Post build() {
			Post p = new Post(generatedId, newsFeed, user, createdOn);
			return p;
		}
	}
}
