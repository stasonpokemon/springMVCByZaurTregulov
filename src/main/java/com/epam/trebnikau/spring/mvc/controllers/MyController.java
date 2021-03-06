package com.epam.trebnikau.spring.mvc.controllers;

import com.epam.trebnikau.spring.mvc.entitys.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
@RequestMapping("employee")
public class MyController {

    @RequestMapping("/")
    public String showFirstView() {
        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails(Model model) {
        model.addAttribute("employee", new Employee());
        return "ask-emp-det";
    }

    @GetMapping( "/showDetails")
    public String showEmployeeDetails(@Valid @ModelAttribute("employee") Employee employee,
                                      BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "ask-emp-det";
        } else {
            return "show-emp-det";
        }
    }
}
