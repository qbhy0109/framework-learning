package com.yb.dao;

import com.yb.pojo.Blog;
import com.yb.querytype.*;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface BlogDao {
	
	Blog getBlogById(Long id);
	
	List<Blog> getAllBlog();

	void createBlog(Blog blog);
	
	void saveBlog(Blog blog);

	void viewsAdd(Long id);
	
	void deleteBlogById(Long id);
}











