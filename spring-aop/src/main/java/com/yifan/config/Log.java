package com.yifan.config;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * 前置环绕
 */
public class Log implements MethodBeforeAdvice {
    /**
     *
     * @param method  要执行的目标对象的方法
     * @param objects 参数
     * @param o       目标对象
     * @throws Throwable
     */
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println(o.getClass().getName() + "的" + method.getName() + "执行");
    }
}
