package com.viki.mapper.impl;

import com.viki.entity.User;
import com.viki.mapper.UserMapper;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class UserMapperImpl implements UserMapper {

    private SqlSessionTemplate sqlSessionTemplate;

    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    public List<User> query() {
        UserMapper mapper = sqlSessionTemplate.getMapper(UserMapper.class);

        return mapper.query();
    }
}
