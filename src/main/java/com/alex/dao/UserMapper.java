package com.alex.dao;

import com.alex.bean.User;

/**
 * BY Alex CREATED 2021/8/18
 */


public interface UserMapper {

    User selectUser(String name);
}
