package com.chan.news.dao;

import java.util.List;

import com.chan.news.domain.News;

public interface INewsDao {
	public void addNews(News news);
	public List<News> getNewses();
}
