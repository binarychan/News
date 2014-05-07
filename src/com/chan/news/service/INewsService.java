package com.chan.news.service;

import java.util.List;

import com.chan.news.domain.News;

public interface INewsService {
	
	public void addNews(News news);
	public List<News> getNewses();
	
}
