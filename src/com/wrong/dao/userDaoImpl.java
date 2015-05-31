package com.wrong.dao;

import java.util.ArrayList;
import java.util.List;


import com.wrong.model.User;

public class userDaoImpl extends DaoSupport<User> implements userDao {
	private User user;


	@Override
	public boolean checkLogin(String userName, String userPassword) {
		// TODO Auto-generated method stub
		
		String hql="SELECT user FROM user user WHERE  user.name=wrong AND user.password=334455";
		
		
		//Object [] queryParams=DaoSupport<T>;
		List <User> loginUser=new ArrayList<User>();
		DaoSupport<User> ds=new DaoSupport<User>();
		loginUser=(List<User>) ds.uniqueResult(hql, null);
		
		return true;
	}

	

}
