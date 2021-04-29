package com.yifan.test;

import com.yifan.entity.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Assemble {
    ApplicationContext context = new ClassPathXmlApplicationContext("Assemble.xml");

    /**
     * 手动装配
     */
    @Test
    public void test(){
        Person person = context.getBean("person", Person.class);
        System.out.println(person.getName());
        person.getCat().soul();
        person.getPig().soul();
    }

    @Test
    public void test2(){
        Person pson = context.getBean("pson", Person.class);

        System.out.println(pson.getName());
        pson.getCat().soul();
        pson.getPig().soul();
    }
}
