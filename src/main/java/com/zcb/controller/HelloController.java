package com.zcb.controller;


import javafx.application.Application;
import org.springframework.boot.builder.SpringApplicationBuilder;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HelloController {

    @RequestMapping("hello")
    public String  hello() {
        return "Hello World!";
    }

 /*   //打 war 包时需要加入
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }*/
}

