package com.Excelr.SecureApplication;

import jakarta.persistence.*;

@Entity
public class User {
	
	@Id
	private Long Id;
	private String username;
	private String password;
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
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
	
	

}
