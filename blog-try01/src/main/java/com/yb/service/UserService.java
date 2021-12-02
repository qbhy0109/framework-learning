package com.yb.service;

import java.util.List;

import com.yb.pojo.User;

public interface UserService {
	
	User getUserById(Long id);
	List<User> getListUser(); // some parameter
	int checkUser(String username);

	void newUser(User user);
}
