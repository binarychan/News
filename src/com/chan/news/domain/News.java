package com.chan.news.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * 新闻类
 * @author Chan
 */
public class News implements Serializable {

	private Integer id; 
	private String title;  
	private String summary;
	private String content;
	private Set<Comment> comments = new HashSet<Comment>();
	
	private String picUrl; // 对应新闻图片在服务器端的URL
	private String newsCategory; // 对应的新闻类别
	private Date publishTime; // 新闻发布时间

	private Integer followNum; // 新闻跟帖数目，初始化为0
	
	public News() {}

	public News(String title, String summary, String content,
			Set<Comment> comments, String picUrl, String newsCategory,
			Date publishTime, Integer followNum) {
		super();
		this.title = title;
		this.summary = summary;
		this.content = content;
		this.comments = comments;
		this.picUrl = picUrl;
		this.newsCategory = newsCategory;
		this.publishTime = publishTime;
		this.followNum = followNum;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Set<Comment> getComments() {
		return comments;
	}

	public void setComments(Set<Comment> comments) {
		this.comments = comments;
	}

	public String getPicUrl() {
		return picUrl;
	}

	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public String getNewsCategory() {
		return newsCategory;
	}

	public void setNewsCategory(String newsCategory) {
		this.newsCategory = newsCategory;
	}

	public Date getPublishTime() {
		return publishTime;
	}

	public void setPublishTime(Date publishTime) {
		this.publishTime = publishTime;
	}

	public Integer getFollowNum() {
		return followNum;
	}

	public void setFollowNum(Integer followNum) {
		this.followNum = followNum;
	}
	
}
