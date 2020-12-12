package com.ycw.consumer.controller;

import com.ycw.pojo.User;
import com.ycw.service.UserService;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: ychw
 * @Description:
 * @Date: 2020/12/10 14:44
 */
@Controller
@RequestMapping
public class UserController {
    private static final Logger LOGGER= LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping("find")
    @ResponseBody
    public User find(Integer id) {
        User user = userService.findById(id);
        LOGGER.info("dubbo服务返回的数据:"+user);
        return user;

    }

    @RequestMapping("test")
    @ResponseBody
    public String test() {
        return "success";

    }

}
