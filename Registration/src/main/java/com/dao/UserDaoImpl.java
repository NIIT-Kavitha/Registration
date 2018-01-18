package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.model.User;

@Repository
public class UserDaoImpl implements UserDao {

	
		private SessionFactory sessionFactory;

		public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

		public void addUser(User user) {
			Session session = sessionFactory.getCurrentSession();

			System.out.println("Test");

	
	        session.saveOrUpdate(user);        
	        User users = new User();      

	        users.setUsername(users.getUsername());
	        users.setPassword(users.getPassword());
	        users.setEmail(users.getEmail());
	        users.setContact_no(users.getContact_no());
	        users.setEnabled(true);
	      
	    	session.saveOrUpdate(users);
	
		
	}

}
