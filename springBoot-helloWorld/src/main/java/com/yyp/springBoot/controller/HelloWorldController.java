package com.yyp.springBoot.controller;

import com.yyp.springBoot.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    @Autowired
    User user;

    @RequestMapping("/world")
    public String hello(){
        if(user==null){
            System.out.println("kong");
        }else{
            System.out.println("feikong");
        }
        return "Hello World!";
    }
}
