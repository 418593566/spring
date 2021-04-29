package com.yifan.config;

import com.yifan.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
/**
 * 类似 application.xml
 */
public class VikiConfig {

    /**
     *  <bean id = "getUser" class = "User"/>
     * @return
     */
    @Bean
    public User getUser(){
        return new User();
    }
}
