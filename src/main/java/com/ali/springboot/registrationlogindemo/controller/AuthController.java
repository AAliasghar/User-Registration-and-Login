package com.ali.springboot.registrationlogindemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {

    // handler method to Home Page request
    @GetMapping("/index")
    public String home(){
        return "index";
    }
}
