package com.viki.dao;

import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {

    void add();
    void del();
    void upd();
    void query();
}
