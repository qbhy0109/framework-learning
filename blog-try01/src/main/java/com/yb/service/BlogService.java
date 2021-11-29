package com.yb.service;

import java.util.List;

import com.yb.pojo.Blog;
import com.yb.querytype.*;

public interface BlogService {
	
	IndexBlog getBlogById(Long id);
	
	List<IndexBlog> getAllBlog();
	
	void saveBlog(Blog blog);
	
	void deleteBlog(Long id);
	
	
}






