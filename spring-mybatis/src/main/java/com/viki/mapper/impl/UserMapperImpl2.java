package com.viki.mapper.impl;

import com.viki.entity.User;
import com.viki.mapper.UserMapper;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserMapper {


    public List<User> query() {
        UserMapper mapper = getSqlSession().getMapper(UserMapper.class);

        return mapper.query();
    }
}
