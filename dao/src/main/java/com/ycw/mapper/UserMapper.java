package com.ycw.mapper;


import com.ycw.pojo.User;

/**
 * @Author: ychw
 * @Description:
 * @Date: 2020/12/10 14:05
 */
public interface UserMapper {
    public User findById(Integer id);
}
