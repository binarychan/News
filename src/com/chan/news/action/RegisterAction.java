package com.chan.news.action;

import java.util.Map;

import com.chan.news.domain.User;
import com.chan.news.service.impl.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private User user;
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String execute() throws Exception {
		UserService us = new UserService();
		us.addUser(user);
		
		// 将用户登录信息写入cookie
		ActionContext ctx = ActionContext.getContext();
		
		Map<String,Object> session = ctx.getSession();
		session.put("username", user.getName());
		ctx.put("tip", "服务器提示：您已经成功登录！");
		
		return SUCCESS;
	}
	
}
