package com.sep.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;



    @Configuration
//@ComponentScan(basePackages = "com.sep")
    @ComponentScan(basePackages = {"com.sep.proxy","com.sep.service","com.sep.repository"})
    public class ProjectConfig {
    }

