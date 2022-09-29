package com.example.arthas.controller;

import com.example.arthas.model.UserModel;
import com.example.arthas.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 姚飞虎
 * @Date: 2022/9/27 7:42 PM
 * @Description:
 */

@RestController
public class DemoController {

    @Autowired
    private DemoService demoService;

    @RequestMapping("/user")
    @GetMapping
    public String list(String name){
        UserModel userModel = new UserModel();
        userModel.setId("1");
        userModel.setAge(18);
        userModel.setName(name);
        return demoService.getUser(name, userModel);
    }

}
