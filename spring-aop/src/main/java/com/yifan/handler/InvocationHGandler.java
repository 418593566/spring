package com.yifan.handler;

import com.yifan.dao.UserDao;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class InvocationHGandler implements InvocationHandler {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),userDao.getClass().getInterfaces(),this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        //代理被代理的接口
        Object invoke = method.invoke(userDao, args);

        return invoke;
    }
}
