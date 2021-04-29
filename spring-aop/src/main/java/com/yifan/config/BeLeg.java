package com.yifan.config;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class BeLeg implements AfterReturningAdvice {

    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("执行" + method.getName() + "返回" + o);
    }
}
