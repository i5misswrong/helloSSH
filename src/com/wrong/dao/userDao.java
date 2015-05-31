package com.wrong.dao;

import com.wrong.model.*;
public interface userDao extends BaseDao<User>{
	public boolean checkLogin(String userName,String userPassword);
}
