package com.yifan.test;

import com.yifan.entity.Mise;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MiseBean {
    private ApplicationContext context =  new ClassPathXmlApplicationContext("applicationContest.xml");

    @Test
    public void test(){
        Mise mise = context.getBean("mise", Mise.class);
        System.out.println(mise);
    }


    @Test
    public void test2(){
        int f = f(10, 5);
        System.out.println(f);
    }

    public static int f(int n, int m){
        return n == 1 ? n : (f(n - 1, m) + m - 1) % n + 1;
    }
}
