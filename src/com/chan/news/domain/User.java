package com.chan.news.domain;

import java.io.Serializable;

public class User implements Serializable {

	private Integer id;
	private String name;
	private String pass;
	private Long points; // 用户积分，用于后期扩展，8个字节
	private String email;
	
	public User() {}

	public Long getPoints() {
		return points;
	}

	public void setPoints(Long points) {
		this.points = points;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
