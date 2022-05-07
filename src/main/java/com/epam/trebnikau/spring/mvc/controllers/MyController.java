package com.epam.trebnikau.spring.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

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
    public String showEmployeeDetails(@RequestParam("employeeName") String employeeName, Model model){
        employeeName = "Mr. " + employeeName;
        model.addAttribute("employeeName",employeeName);
        return "show-emp-det";
    }
}
