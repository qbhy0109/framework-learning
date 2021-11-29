package com.yb.dao;

import com.yb.pojo.Blog;
import com.yb.querytype.*;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface BlogDao {
	
	IndexBlog getBlogById(Long id);
	
	List<IndexBlog> getAllBlog();
	
	void saveBlog(Blog blog);
	
	void deleteBlog(Long id);
}











