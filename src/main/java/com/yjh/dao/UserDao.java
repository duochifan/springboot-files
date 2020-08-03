package com.yjh.dao;

import com.yjh.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author mua
 * @Date 2020/8/3 10:46
 */
@Mapper
public interface UserDao {

    public User login(User user);
}
