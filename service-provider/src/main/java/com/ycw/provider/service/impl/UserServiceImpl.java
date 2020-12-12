package com.ycw.provider.service.impl;

import com.ycw.mapper.UserMapper;
import com.ycw.pojo.User;
import com.ycw.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author: ychw
 * @Description:
 * @Date: 2020/12/10 14:03
 */
public class UserServiceImpl implements UserService {
    private static final Logger LOGGER= LoggerFactory.getLogger(UserServiceImpl.class);
    @Autowired
    private UserMapper userMapper;

    @Override
    public User findById(Integer id) {
        User user = userMapper.findById(id);
        LOGGER.info("provider查出来的数据："+user);
        return user;
    }
}
