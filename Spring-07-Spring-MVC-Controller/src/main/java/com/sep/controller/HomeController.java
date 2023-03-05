package com.sep.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/home")
    public String name(){
        return "home.html";
    }

    @RequestMapping("/welcome")
    public String name2(){
        return "welcome.html";
    }



}
