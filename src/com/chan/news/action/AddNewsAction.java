package com.chan.news.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.UUID;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chan.news.domain.News;
import com.chan.news.service.INewsService;
import com.chan.news.service.impl.NewsService;
import com.opensymphony.xwork2.ActionSupport;

public class AddNewsAction extends ActionSupport {
	
	
	private String picName;
	// 每个文件上传域需要3个Field进行封装
	private File pic;          // 上传文件本身	       
	private String picFileName;// 上传文件的原始文件名
	private String picContentType;//上传文件的文件类型
	
	private News news;
	
	public String getPicName() {
		return picName;
	}

	public void setPicName(String picName) {
		this.picName = picName;
	}

	public File getPic() {
		return pic;
	}

	public void setPic(File pic) {
		this.pic = pic;
	}

	public String getPicFileName() {
		return picFileName;
	}

	public void setPicFileName(String picFileName) {
		this.picFileName = picFileName;
	}

	public String getPicContentType() {
		return picContentType;
	}

	public void setPicContentType(String picContentType) {
		this.picContentType = picContentType;
	}

	public News getNews() {
		return news;
	}

	public void setNews(News news) {
		this.news = news;
	}

	public void uploadImage() throws Exception {
		String uploadPath = ServletActionContext.getServletContext().getRealPath("/UploadImages");
		
		String newFileName = UUID.randomUUID().toString() 
				+ picFileName.substring(picFileName.lastIndexOf(".")); // 使用新名字将上传文件保存
		// 将图片上传后在服务器的URL保存在数据库
		// http://192.168.1.104:8080/News + picUrl
		news.setPicUrl("/UploadImages" + File.separator + newFileName);
		//System.out.println(uploadPath + "/" + newFileName);
		
		FileInputStream fis = new FileInputStream(pic);
		FileOutputStream fos = new FileOutputStream(uploadPath + File.separator + newFileName);
		int hasRead = 0;
		byte[] buff = new byte[1024];
		while((hasRead = fis.read(buff)) > 0) {
			fos.write(buff, 0, hasRead);
		}
		fis.close();
		fos.close();
	}

	@Override
	public String execute() throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		INewsService newsService = (INewsService) context.getBean("newsService");
		
		uploadImage();
		
		newsService.addNews(news);
		
		return SUCCESS;
	}

	
	
}
