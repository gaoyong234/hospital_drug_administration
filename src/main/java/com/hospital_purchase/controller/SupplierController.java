package com.hospital_purchase.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("supplier")
public class SupplierController {
    /**
     * 页面跳转
     * @return 返回要跳转的页面名
     */
    @RequestMapping(value = "/resupplier",method = RequestMethod.GET)
    public String forIndex(){
        return "supplier";
    }


}
