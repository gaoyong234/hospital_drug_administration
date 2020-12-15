package com.hospital_purchase.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class Submit {
    @RequestMapping("stf")
    public String aa(){
        return "/returnOrder/submit order";
    }
}
