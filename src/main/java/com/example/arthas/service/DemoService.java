package com.example.arthas.service;

import com.example.arthas.model.UserModel;
import org.springframework.stereotype.Service;

/**
 * @Author: 姚飞虎
 * @Date: 2022/9/27 7:42 PM
 * @Description:
 */
@Service
public class DemoService {

    private static String PATH = "/home";

    private String user;

    public String getUser(String name, UserModel userModel) {
        user = "zhangsan";
        return "returnObj:" + userModel.getName();
    }
}
