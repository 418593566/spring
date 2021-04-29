package com.gtv.mapper;


import com.gtv.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    List<User> query();

    int add(Map<String,Object> map);

    int delete(Long id);
}
