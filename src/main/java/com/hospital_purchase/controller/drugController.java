package com.hospital_purchase.controller;

import com.hospital_purchase.pojo.DrugItems;
import com.hospital_purchase.service.DurgItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class drugController {
    @Autowired
    private DurgItemsService durgItemsService;

    @RequestMapping("/durgItemsInquire")
    public ModelAndView durgItemsInquire(){
        ModelAndView mode = new ModelAndView();
        mode.setViewName("durgItemsInquire");
       // mode.addObject("key","123");
        List<DrugItems> drugItems = durgItemsService.inquireDurgItems();
        mode.addObject("list",drugItems);
        return mode;
    }

}
