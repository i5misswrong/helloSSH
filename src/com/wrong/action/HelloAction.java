package com.wrong.action;

import com.opensymphony.xwork2.ActionSupport;
import com.wrong.dao.DaoSupport;
import com.wrong.dao.userDao;
import com.wrong.dao.userDaoImpl;
import com.wrong.model.User;

public class HelloAction extends ActionSupport{
	private User user;
	private String userName;
	private String userPassword;
	

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
	
	public String execute() throws Exception{
		userDaoImpl us=new userDaoImpl();
		boolean flag=us.checkLogin(userName, userPassword);
		return SUCCESS;
	}
}
