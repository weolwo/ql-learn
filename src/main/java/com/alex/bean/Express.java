package com.alex.bean;

import lombok.Data;

@Data
public class Express {

    private Integer id;

    private Integer expType;

    private String params;

    private String[] paramsEx;

    private String expName;

    private String methodName;
}
