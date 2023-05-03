package com.scaler.payloads;

import java.io.BufferedReader;
import java.io.IOException;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class UserDTO {
	@NotNull
	private String firstname;
	@NotNull
	private String lastname;
	@NotNull
	private String username;
	@NotNull
	@Size(min = 8, max = 15)
	private String password;
	
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
	public void takeUserInput(BufferedReader br) throws IOException {
		System.out.println("Enter First Name  : ");
		this.setFirstname(br.readLine());
		System.out.println("Enter Last Name  : ");
		this.setLastname(br.readLine());
		System.out.println("Enter User Name  : ");
		this.setUsername(br.readLine());
		System.out.println("Enter Password  : ");
		this.setPassword(br.readLine());
	}
	@Override
	public String toString() {
		return "UserDTO [firstname=" + firstname + ", lastname=" + lastname + ", username=" + username + "]";
	}
}

