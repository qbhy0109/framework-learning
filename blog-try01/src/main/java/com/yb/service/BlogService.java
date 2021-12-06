package com.yb.service;

import java.util.List;

import com.yb.pojo.Blog;
import com.yb.querytype.*;

public interface BlogService {
	
	Blog getBlogById(Long id);
	
	List<Blog> getAllBlog();

	void createBlog(Blog blog);
	
	void saveBlog(Blog blog);

	void viewsAdd(Long id);
	
	void deleteBlogById(Long id);
	
	
}






