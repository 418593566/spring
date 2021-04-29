package com.yifan.service.serviceImpl;

import com.yifan.mapper.UserDao;
import com.yifan.service.UserService;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void str() {
        userDao.str();
    }
}
