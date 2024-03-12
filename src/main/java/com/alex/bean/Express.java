package com.alex.bean;

import lombok.Data;

@Data
public class Express {

    private Integer id;

    private String activityCode;

    private String params;

    private String[] paramsEx;

    private String expName;

    private String methodName;
}
