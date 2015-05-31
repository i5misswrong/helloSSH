package com.wrong.dao;

import java.nio.channels.SeekableByteChannel;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.wrong.model.User;

public class userDaoImpl extends DaoSupport<User> implements userDao {
	private User user;
	private SessionFactory sessionFactory;

	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}


	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	
	@Override
	public List checkLogin(String userName, String userPassword) {
		// TODO Auto-generated method stub
		Resource res=new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(res);
		SessionFactory sessionFactory=(SessionFactory) factory.getBean("sessionFactory");
		Session session=sessionFactory.openSession();
		Transaction tx=null;
		List list=new ArrayList();
		try{
			tx=session.beginTransaction();
			tx.begin();
			String hql="from User";
			Query query=session.createQuery(hql);
			list=query.list();
			
			System.out.println(list+"list");
		}
		catch(HibernateException e){
			e.printStackTrace();
		}
		return list;
		
	}

}
