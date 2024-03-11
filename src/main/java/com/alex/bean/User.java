package com.alex.bean;

import lombok.Data;

import java.util.Date;

@Data
public class User {

    private Integer id;

    public String name;

    public  String sex;

    public  Integer age;

    public  Double sal;

    public  Integer userLevel;

    public Date createdDate;

    public User() {

    }

    public User(Integer id, String name, String sex, Integer age, Double sal, Integer userLevel, Date createdDate) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.sal = sal;
        this.userLevel = userLevel;
        this.createdDate = createdDate;
    }

}
