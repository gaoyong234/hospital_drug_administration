package com.hospital_purchase.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/returnOrder")
public class ReturnOrderController {

    @RequestMapping("/toReturnOrderInterface")
    public String toReturnOrderInterface(){
        return "returnOrder/returnOrder";
    }
}
