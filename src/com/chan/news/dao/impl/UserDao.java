package com.chan.news.dao.impl;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.chan.news.dao.IUserDao;
import com.chan.news.domain.User;
import com.chan.news.util.HibernateUtils;

public class UserDao implements IUserDao {

	@Override
	public void addUser(User user) {
		
		Session session = HibernateUtils.getInstance().getSession();
		Transaction transaction = session.beginTransaction();
		session.save(user);
		transaction.commit();
		
	}
	
}
