package com.chan.news.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chan.news.domain.User;

public class TestSpring {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		User user = (User) context.getBean("user");
		System.out.println(user.getId() + user.getName()
				+ user.getEmail() + user.getPass());
	}
	
}
