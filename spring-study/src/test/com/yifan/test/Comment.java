package com.yifan.test;


import com.yifan.entity.Person;
import org.junit.Test;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Comment {

    private ApplicationContext context = new ClassPathXmlApplicationContext("Comment.xml");

    @Test
    public void test(){
        Person person = context.getBean("person", Person.class);

        System.out.println(person.getName());
        person.getCat().soul();
        person.getPig().soul();
    }
}
