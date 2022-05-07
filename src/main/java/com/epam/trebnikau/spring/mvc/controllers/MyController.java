package com.epam.trebnikau.spring.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

    @RequestMapping("/")
    public String showFirstView(){
        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails(){
        return "ask-emp-det";
    }

    @RequestMapping("/showDetails")
    public String showEmployeeDetails(){
        return "show-emp-det";
    }
}
