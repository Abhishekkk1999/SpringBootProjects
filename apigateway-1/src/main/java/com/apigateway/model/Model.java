package com.apigateway.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="logindetails")
public class Model {
	@Id
	@Column
	private String username;
	@Column
	private String emailId;
	@Column
	private String password;
	@Column
	private String address;
	public Model(String username, String emailId, String password, String address) {
		super();
		this.username = username;
		this.emailId = emailId;
		this.password = password;
		this.address = address;
	}
	public Model() {
		super();
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	

}
