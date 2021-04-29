package com.yifan.test;

import com.viki.dao.UserDao;
import com.viki.dao.impl.UserDaoImpl;
import com.viki.utils.ProxyInvocationHandler;

public class ProxyTest2 {

    public static void main(String[] args) {

        UserDaoImpl userDao = new UserDaoImpl();

        ProxyInvocationHandler px = new ProxyInvocationHandler();

        px.setUserDao(userDao);

        UserDao proxy = (UserDao) px.getProxy();
        proxy.query();
    }
}
