package com.example.demo2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.ServletContext;

@Controller
@RequestMapping("/application-scope") 
public class ApplicationController {

    @Autowired
    private ServletContext application;

    @RequestMapping("/home")
    public String index(Model model) {
        Integer counter = (Integer) application.getAttribute("counter");
        
        
        if (counter == null) {
            application.setAttribute("counter", 1);
        } else {
            counter++;  
            application.setAttribute("counter", counter);

        }

       
        model.addAttribute("counter", counter);

        return "application-scope";  
    }
}