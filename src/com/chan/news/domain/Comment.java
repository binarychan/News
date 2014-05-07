package com.chan.news.domain;

import java.io.Serializable;

/**
 * 评论类：一条评论属于一条新闻，来自一个用户
 * @author Chan
 */
public class Comment implements Serializable {
	
	private Integer id;
	private News news; 
	private User user;
	
	private String content;
	
	public Comment() {}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public News getNews() {
		return news;
	}

	public void setNews(News news) {
		this.news = news;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}
