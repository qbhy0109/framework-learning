package com.yb.service.implement;

import com.yb.service.BlogService;
import com.yb.dao.BlogDao;
import com.yb.querytype.*;
import com.yb.pojo.Blog;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlogServiceImpl implements BlogService {
	
	@Autowired
	private BlogDao blogDao;
	
	@Override
	public IndexBlog getBlogById(Long id) {
		return blogDao.getBlogById(id);
	}
	
	@Override
	public List<IndexBlog> getAllBlog(){
		return blogDao.getAllBlog();
	}
	
	@Override
	public void saveBlog(Blog blog) {
		blogDao.saveBlog(blog);
	}
	
	@Override
	public void deleteBlog(Long id) {
		blogDao.deleteBlog(id);
	}
	
}












