package com.viki.service;

import com.viki.dao.UserDao;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ServiceProxy implements InvocationHandler {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),userDao.getClass().getInterfaces(),this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        show(method.getName());
        Object invoke = method.invoke(userDao,args);
        return invoke;
    }

    public void show(String msg){
        System.out.println("执行="+msg);
    }
}
