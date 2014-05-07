package com.chan.news.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.chan.news.dao.INewsDao;
import com.chan.news.domain.News;
import com.chan.news.util.HibernateUtils;

public class NewsDao implements INewsDao {

	@Override
	public void addNews(News news) {
		
		Session session = HibernateUtils.getInstance().getSession();
		Transaction transaction = session.beginTransaction();
		session.save(news);
		transaction.commit();
		
	}

	@Override
	public List<News> getNewses() {
		
		Session session = HibernateUtils.getInstance().getSession();
		Transaction transaction = session.beginTransaction();
		Query query = session.createQuery("from News");
		query.setFirstResult(0);
		query.setMaxResults(20);
		List<News> newses = query.list();
		transaction.commit();
		return newses;
	}

}
