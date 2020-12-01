package com.hospital_purchase.controller;

import com.hospital_purchase.service.DurgItemsService;
import com.hospital_purchase.vo.DrugItemsVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class LoginController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }


}
