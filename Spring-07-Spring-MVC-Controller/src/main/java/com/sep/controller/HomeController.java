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
    public String welcome(){
        return "welcome.html";
    }



//    //If I do not add name to annotation, it will as default
//    @RequestMapping
//    public String userInfo(){
//        return "userinfo.html";
//    }

}
