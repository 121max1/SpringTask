package com.maxshkodin.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
    @RequestMapping(value="/", method= RequestMethod.GET)
    public String getHomePage(Model model) {
        return "home";
    }
}
