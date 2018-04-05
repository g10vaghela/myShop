package com.myshop.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class BaseDao {
	public Session getSession(){
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		return sessionFactory.openSession();		
	}
	
	public void closeSession(Session session){
		if(session.isOpen()){
			session.close();
		}
	}
}
