package com.chan.news.service.impl;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chan.news.dao.INewsDao;
import com.chan.news.domain.News;
import com.chan.news.service.INewsService;

public class NewsService implements INewsService {

	@Override
	public void addNews(News news) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		INewsDao newsDao = (INewsDao) context.getBean("newsDao");
		newsDao.addNews(news);
	}

	@Override
	public List<News> getNewses() {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		INewsDao newsDao = (INewsDao) context.getBean("newsDao");
		List<News> newses = newsDao.getNewses();
		
		return newses;
	}

}
