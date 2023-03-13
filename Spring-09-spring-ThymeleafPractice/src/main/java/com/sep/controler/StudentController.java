package com.sep.controler;

import com.sep.boostrap.DataGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



    @Controller
    @RequestMapping("/student")
    public class StudentController {
        @RequestMapping("/register")
        public String register(Model model){
            model.addAttribute("students", DataGenerator.creatStudent());
            return "student/register";
        }
@RequestMapping("/welcome")
        public String info(){


            return "student/welcome";
        }





    }

