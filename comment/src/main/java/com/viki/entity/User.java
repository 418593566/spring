package com.viki.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class User {

    @Value("张飞")
    public String name;
}
