package com.chan.news.action;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chan.news.domain.News;
import com.chan.news.service.INewsService;
import com.opensymphony.xwork2.ActionSupport;

public class GetNewsesAction extends ActionSupport {

	private List<News> newses;

	public List<News> getNewses() {
		return newses;
	}

	public void setNewses(List<News> newses) {
		this.newses = newses;
	}

	@Override
	public String execute() {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		INewsService newsService = (INewsService) context.getBean("newsService");
		
		newses = newsService.getNewses();
		
		return SUCCESS;
	}
	
}
