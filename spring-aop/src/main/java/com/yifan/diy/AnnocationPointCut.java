package com.yifan.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AnnocationPointCut {

    @Before("execution(* com.yifan.dao.impl.UserDaoImpl.*(..))")
    public void before(){
        System.out.println("前");
    }

    @After("execution(* com.yifan.dao.impl.UserDaoImpl.*(..))")
    public void after(){
        System.out.println("后");
    }

    @Around("execution(* com.yifan.dao.impl.UserDaoImpl.*(..))")
    public void around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("环绕前");
        Object proceed = pjp.proceed();
        System.out.println("环绕后");
    }
}
