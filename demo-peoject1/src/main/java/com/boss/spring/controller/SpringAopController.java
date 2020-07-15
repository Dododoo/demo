package com.boss.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SpringAopController {
    @RequestMapping(value = "testSpringAop", method = RequestMethod.GET)
    public String testSpringAop(){

        return "success";
    }
}
