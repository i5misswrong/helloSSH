package com.wrong.model;

// Generated 2015-5-30 23:07:40 by Hibernate Tools 3.4.0.CR1

/**
 * User generated by hbm2java
 */
public class User implements java.io.Serializable {

	private Integer userId;
	private String userName;
	private String userPassword;

	public User() {
	}

	public User(String userName, String userPassword) {
		this.userName = userName;
		this.userPassword = userPassword;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return this.userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

}