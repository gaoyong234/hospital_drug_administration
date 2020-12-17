package com.hospital_purchase.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class Statements {
    @RequestMapping("stinfo.do")
    public String aa(){
        return "/returnOrder/statements";

    }


}

