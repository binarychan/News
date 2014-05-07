<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/addNews.js">
</script>

<title>添加新闻页面</title>
</head>
<body>
<h2>添加新闻</h2>

<s:form action="addNewsPro" enctype="multipart/form-data" method="post">
 
<s:bean name="com.chan.news.constant.CategoriesBean" id="cats"></s:bean>
<s:select  
	name="news.newsCategory"
	list="#cats.categories"  
	label="选择类别">  
</s:select>

<s:textfield name="news.title" label="新闻标题" />
<s:textfield name="news.summary" label="新闻概要" />

<s:textfield name="picName" label="图片名"/>	
<s:file name="pic" label="选择图片"/><!-- 上传文件本身，File类型 -->

<s:textarea name="news.content" rows="5" cols="50" label="新闻正文" />

<s:submit value="确认添加" />

</s:form> 


</body>
</html>