package com.model;

import javax.persistence.*;

@Entity
public class User {
	
	private String username;
	private String password;
	@Id
	private String email;
	private String contact_no;
	private boolean enabled;
	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact_no() {
		return contact_no;
	}
	public void setContact_no(String contact_no) {
		this.contact_no = contact_no;
	}
	public void setEnabled(boolean enabled) {
		
		this.enabled=enabled;
	}
	
	

}
