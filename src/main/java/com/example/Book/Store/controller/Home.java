package com.example.Book.Store.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class Home {

    @RequestMapping("/home")
    public String home () {
        return "/home";
    }

    @RequestMapping("/")
    public String root () {
        return "/home";
    }


}
