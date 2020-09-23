package com.sun.shixun.springboot_demo.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.sun.shixun.springboot_demo.entity.User;
import org.apache.ibatis.annotations.Select;

public interface UserDao extends BaseMapper<User> {
   /* @Select("select * from User where id = #{id}")
    User getById(Integer id);*/
}
