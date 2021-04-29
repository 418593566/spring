package com.yifan.diy;

public class CustomProxy {

    public void before(){
        System.out.println("之前执行");
    }

    public void after(){
        System.out.println("后执行");
    }
}
