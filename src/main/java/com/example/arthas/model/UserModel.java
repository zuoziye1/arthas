package com.example.arthas.model;

import lombok.Data;

/**
 * @Author: 姚飞虎
 * @Date: 2022/9/27 7:43 PM
 * @Description:
 */
@Data
public class UserModel {

    public UserModel(){}

    public UserModel(String id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    private String id;

    private String name;

    private Integer age;

}
