package com.yb.dao;

import com.yb.pojo.User;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.apache.ibatis.annotations.Mapper;

@Mapper
@Repository
public interface UserDao {

	//select
	User getUserById(Long id);
	User getUserByName(String username);
	List<User> getListUser(); // some parameter
	int checkUser(String username);

	//insert
	void newUser(User user);
}
