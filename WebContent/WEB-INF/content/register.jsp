<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户注册</title>
</head>
<body>

<s:form action="registerPro">
<s:textfield name="user.name" label="用户名" />
<s:textfield name="user.email" label="邮箱" />
<s:textfield name="user.pass" label="密码" />
<s:textfield label="确认密码" />
<s:submit value="提交注册" />
</s:form>

</body>
</html>