package com.hospital_purchase.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/toMassage")
    public String toMassage(){
        return "homePage";
    }

    @RequestMapping("/toRegister")
    public String toRegister(){
        return "register";
    }


}
