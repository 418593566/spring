package com.yifan.test;

import com.viki.entity.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class t1 {
    ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");

    @Test
    public void test(){
        User user = context.getBean("user", User.class);

        System.out.println(user.name.toString());
    }
}
