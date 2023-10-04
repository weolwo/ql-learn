package com.alex.controller;

import com.alex.dao.UserMapper;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * BY Alex CREATED 2021/8/18
 */

@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/login")
    public Object login(HttpServletRequest request) {

        return userMapper.selectUserList();

    }
}
