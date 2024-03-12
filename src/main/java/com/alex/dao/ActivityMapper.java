package com.alex.dao;


import com.alex.bean.Activity;

/**
 * BY Alex CREATED 2021/8/18
 */


public interface ActivityMapper {

  Activity selectActivityByCode(String activityCode);
}
