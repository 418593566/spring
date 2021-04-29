package com.gtv.mapper.impl;

import com.gtv.entity.User;
import com.gtv.mapper.UserMapper;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.core.annotation.MergedAnnotationPredicates;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper {


    public List<User> query() {
        UserMapper mapper = getSqlSession().getMapper(UserMapper.class);
        Map map = new HashMap();
        map.put("id",12l);
        map.put("name","卡卡");
        map.put("pwd","12345");

        mapper.add(map);
        mapper.delete(12l);

        return mapper.query();
    }

    public int add(Map<String, Object> map) {
        return getSqlSession().getMapper(UserMapper.class).add(map);
    }

    public int delete(Long id) {
        return getSqlSession().getMapper(UserMapper.class).delete(id);
    }
}
