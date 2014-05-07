package com.chan.news.constant;

import java.util.ArrayList;
import java.util.List;

public class CategoriesBean {
	
	private List<String> categories;
	
	public static final String HEADLINE = "头条";
	public static final String SPORTS = "体育";
	public static final String TECH = "科技";
	public static final String FINANCE = "经济";
	
	public List<String> getCategories() {
		List<String> cats = new ArrayList<String>();
		cats.add(HEADLINE);
		cats.add(SPORTS);
		cats.add(TECH);
		cats.add(FINANCE);
		return cats;
	}
	
}
