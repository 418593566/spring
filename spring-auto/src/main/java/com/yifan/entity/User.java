package com.yifan.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component     //代表这个类被spring 托管
/**
 * @Value
 *      <property name="name" value="like"/>
 */
public class User {

    @Value("like")
    public String name;
}
