package com.newsfeed.models;

import java.util.List;

public class User {
	
	private int id;
	private String firstname;
	private String lastname;
	private String username;
	private String password;
	private List<User> followedByUsers;
			
	public int getId() {
		return id;
	}

	public void setFollowedByUsers(List<User> followedByUsers) {
		this.followedByUsers = followedByUsers;
	}

	public List<User> getFollowedByUsers() {
		return followedByUsers;
	}

	public void setFollowedByUsers(User followedByUser) {
		this.followedByUsers.add(followedByUser);
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [id=" + id + " firstname=" + firstname + ", lastname=" + lastname + ", username=" + username
				+ ", password=" + password + "]" + 
				"\n followed by " + followedByUsers;
	}
	
	private User(int id, String firstname, String lastname, String username, String password) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.username = username;
		this.password = password;
	}

	public static class Builder{
		private static int generatedId;
		
		private String firstname;
		private String lastname;
		private String username;
		private String password;
		
		public Builder setUser(UserDTO userDTO) {
			generatedId++;
			this.firstname = userDTO.getFirstname();
			this.lastname = userDTO.getLastname();
			this.username = userDTO.getUsername();
			this.password = userDTO.getPassword();
			return this;
		}
		
		public User build() {
			User u = new User(generatedId, this.firstname, this.lastname, this.username, this.password);
			return u;
		}
	}
}
