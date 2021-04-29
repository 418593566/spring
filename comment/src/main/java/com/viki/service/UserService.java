package com.viki.service;

import com.viki.dao.UserDao;
import com.viki.dao.impl.UserDaoImpl;

public class UserService {

    private UserDao userDao = new UserDaoImpl();

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add(){
        show("add");
        userDao.add();
    }
    public void del(){
        show("del");
        userDao.del();
    }
    public void upd(){
        show("upd");
        userDao.upd();
    }
    public void query(){
        show("query");
        userDao.query();
    }

    public void show(String msg){
        System.err.println("============"+msg+"用户");
    }
}
