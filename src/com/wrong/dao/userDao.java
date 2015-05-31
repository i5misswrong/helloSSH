package com.wrong.dao;

import java.util.List;

import com.wrong.model.*;
public interface userDao extends BaseDao<User>{
	public List checkLogin(String userName,String userPassword);
}
