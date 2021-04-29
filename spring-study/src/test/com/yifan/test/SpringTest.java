package com.yifan.test;

import com.yifan.entity.Book;
import com.yifan.entity.User;
import com.yifan.mapper.impl.NettyImpl;
import com.yifan.service.serviceImpl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

    private  ApplicationContext context = new ClassPathXmlApplicationContext("applicationContest.xml");

    @Test
    public void test(){
        //获取spring 上下文配置
        ApplicationContext context = new ClassPathXmlApplicationContext("src/main/resources/spring-config.xml");

        User user = context.getBean("user", User.class);

        System.out.println(user.toString());
    }

    @Test
    public void test2(){
        UserServiceImpl userService = new UserServiceImpl();
        userService.setUserDao(new NettyImpl());

        userService.str();
    }

    @Test
    public void test3(){
        UserServiceImpl userDao = context.getBean("ServiceImpl",UserServiceImpl.class);

        userDao.str();
    }

    @Test
    public void test4(){
        Book book = context.getBean("Book", Book.class);

        System.out.println(book);
    }

    @Test
    public void test5(){
//        User userTest = context.getBean("userTest", User.class);
//        User userTest1 = context.getBean("userTest", User.class);
//
//        System.out.println(userTest==userTest1);
//
//        System.out.println(userTest);


        User userText = context.getBean("userText", User.class);
        User userText2 = context.getBean("userText", User.class);
        System.out.println(userText==userText2);
    }
}
