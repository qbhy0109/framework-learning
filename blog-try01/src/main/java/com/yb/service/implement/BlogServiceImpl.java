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
	public Blog getBlogById(Long id) {
		return blogDao.getBlogById(id);
	}
	
	@Override
	public List<Blog> getAllBlog(){
		return blogDao.getAllBlog();
	}

	@Override
	public void createBlog(Blog blog){
		blogDao.createBlog(blog);
	}
	
	@Override
	public void saveBlog(Blog blog) {
		blogDao.saveBlog(blog);
	}

	@Override
	public void viewsAdd(Long id){
		blogDao.viewsAdd(id);
	}
	
	@Override
	public void deleteBlogById(Long id) {
		blogDao.deleteBlogById(id);
	}
	
}












