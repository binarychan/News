package com.chan.news.service.impl;

import com.chan.news.dao.impl.UserDao;
import com.chan.news.domain.User;
import com.chan.news.service.IUserService;

public class UserService implements IUserService {

	@Override
	public void addUser(User user) {
		UserDao ud = new UserDao();
		ud.addUser(user);
	}

}
