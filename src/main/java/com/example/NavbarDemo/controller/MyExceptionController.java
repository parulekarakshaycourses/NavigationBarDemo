package com.example.NavbarDemo.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyExceptionController implements ErrorController
{
    @GetMapping("/error")
    public String handleError(HttpServletRequest request)
    {
        Object status = request.getAttribute(RequestDispatcher. ERROR_STATUS_CODE);
        if (status != null && Integer.valueOf(status.toString()) == HttpStatus.NOT_FOUND.value())
        {
            return "pageNotFoundError";
        }
        if (status != null && Integer.valueOf(status.toString()) == HttpStatus.INTERNAL_SERVER_ERROR.value())
        {
            return "InternalServerError";
        }
        return "error";
    }
}
