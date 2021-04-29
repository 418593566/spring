package com.viki.controller;

import com.viki.dao.UserDao;
import com.viki.dao.impl.UserDaoImpl;
import com.viki.service.UserService;

public class UserController {
    public static void main(String[] args) {
        UserDao userDao = new UserDaoImpl();
        UserService userService = new UserService();
        userService.setUserDao(userDao);

        userService.add();
    }
}
