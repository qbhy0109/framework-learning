package com.yb.service.implement;

import com.yb.pojo.User;
import com.yb.dao.UserDao;
import com.yb.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Long id){
        return userDao.getUserById(id);
    }

    @Override
    public User getUserByName(String username){
        return userDao.getUserByName(username);
    }

    @Override
    public List<User> getListUser(){
        return userDao.getListUser();
    }

    @Override
    public int checkUser(String username){
        return userDao.checkUser(username);
    }



    @Override
    public void newUser(User user){
        userDao.newUser(user);
    }
}
