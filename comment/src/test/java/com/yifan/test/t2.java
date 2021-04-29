package com.yifan.test;

import com.viki.dao.UserDao;
import com.viki.dao.impl.UserDaoImpl;
import com.viki.service.ServiceProxy;

public class t2 {

    public static void main(String[] args) {
        ServiceProxy serviceProxy = new ServiceProxy();

        UserDaoImpl userDao = new UserDaoImpl();

        serviceProxy.setUserDao(userDao);

        UserDao proxy = (UserDao) serviceProxy.getProxy();
        proxy.add();
    }
}
