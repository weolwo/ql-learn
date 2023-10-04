package com.alex.bean;

import java.util.Date;

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getSal() {
        return sal;
    }

    public void setSal(Double sal) {
        this.sal = sal;
    }

    public Integer getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(Integer userLevel) {
        this.userLevel = userLevel;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}
