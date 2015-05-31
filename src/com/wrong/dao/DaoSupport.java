package com.wrong.dao;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@SuppressWarnings("unchecked")
public class DaoSupport <T> implements BaseDao<T> {
	
	protected Class<T> entityClass=GeniericeUtils.getGeniericeType(this.getClass());
	
	@Autowired
	@Qualifier("sessionFactory")
	private SessionFactory sessionFactory;
	protected Session getSession(){
		return  sessionFactory.getCurrentSession();
	}

	@Override
	@Transactional(propagation=Propagation.NOT_SUPPORTED,readOnly=true)
	public Object uniqueResult(String Hql, Object[] queryParams) {
		Query query=getSession().createQuery(Hql);
		setQueryParams(query, queryParams);
		return query.uniqueResult();
	}
	
	protected void setQueryParams(Query query,Object[] queryParams){
		if(queryParams!=null&&queryParams.length>0){
			for(int i=0;i<queryParams.length;i++){
				query.setParameter(i, queryParams[i]);
			}
		}
	}
	
}
