package com.alex.controller;

import com.alex.bean.User;
import com.alex.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * BY Alex CREATED 2021/8/18
 */

@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/login")
    public Object login(HttpServletRequest request) {

        String name = request.getParameter("name");
        User user = userMapper.selectUser(name);
        if (user == null) {
            return "用户名或密码错误";
        }
        //校验用户输入的密码
        return user;
    }
}
