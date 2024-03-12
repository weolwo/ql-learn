package com.alex.bean;

import lombok.Data;

import java.util.Date;

@Data
public class Activity {

    private Integer id;

    private String activityCode;

    private String express;

    private Date beginDate;

    private Date endDate;
}
