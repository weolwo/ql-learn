package com.alex.dao;


import com.alex.bean.User;

import java.util.List;

/**
 * BY Alex CREATED 2021/8/18
 */


public interface UserMapper {

  List<User> selectUserList();
}
