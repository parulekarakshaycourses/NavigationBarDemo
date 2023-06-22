package com.example.NavbarDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user/")
public class UserController 
{
    @GetMapping("/home/")
    public String home()
    {
        return "userHome";
    }

    @GetMapping("/about/")
    public String about()
    {
        return "userAbout";
    }

    @GetMapping("/settings/")
    public String settings()
    {
        return "userSettings";
    }
}
