package com.wrong.dao;

public interface BaseDao<T> {
	public Object uniqueResult(String Hql,Object[] queryParams);
}
