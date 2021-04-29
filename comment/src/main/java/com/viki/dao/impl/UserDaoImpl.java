package com.viki.dao.impl;

import com.viki.dao.UserDao;

public class UserDaoImpl implements UserDao {
    public void add() {
        System.out.println("添加");
    }

    public void del() {
        System.out.println("删除");
    }

    public void upd() {
        System.out.println("修改");
    }

    public void query() {
        System.out.println("查询");
    }
}
