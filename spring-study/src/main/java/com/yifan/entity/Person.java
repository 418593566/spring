package com.yifan.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    /**
     * @Autowired 是通过 byName 来实现自动装配
     * @Resource  是默认是通过 byName 找不到则通过 byType 来实现的
     */
    @Autowired
    @Qualifier(value = "cat2")
    private Cat cat;

    @Resource
    private Pig pig;
    private String name;
}
