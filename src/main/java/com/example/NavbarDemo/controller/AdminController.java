package com.example.NavbarDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController
{
    @GetMapping("/home/")
    public String home()
    {
        return "adminHome";
    }

    @GetMapping("/dashboard/")
    public String dashboard()
    {
        return "adminDashboard";
    }

    @GetMapping("/about/")
    public String about()
    {
        return "adminAbout";
    }

    @GetMapping("/settings/")
    public String settings()
    {
        return "adminSettings";
    }
}
