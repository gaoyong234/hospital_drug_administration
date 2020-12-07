package com.hospital_purchase.controller;

import com.github.pagehelper.PageInfo;
import com.hospital_purchase.pojo.DrugItems;
import com.hospital_purchase.service.DurgItemsService;
import com.hospital_purchase.vo.DrugItemsVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;

@Controller
@RequestMapping("items")
public class DrugItemsController {
    @Autowired
    private DurgItemsService durgItemsService;

    @RequestMapping(value = "/durgItemsInquire",method = RequestMethod.GET)
    public String forIndex(){

        return "durgItemsInquire";
    }

    @RequestMapping("/conditionfand")
    @ResponseBody
    public PageInfo<DrugItemsVO> conditionfand(@RequestParam(value = "pageNum",defaultValue = "1") Integer pageNum,
                                               @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize,
                                               DrugItemsVO druglist){
        PageInfo<DrugItemsVO> conditionfand = durgItemsService.conditionfand(pageNum, pageSize, druglist);
        return conditionfand;
    }

    @RequestMapping("addDrugItems")
    @ResponseBody
    public Integer addDrugItems(DrugItems drugItems){
        Integer integer = durgItemsService.addDrugItems(drugItems);
        System.out.println(integer);
        return integer;
    }

    @RequestMapping("fandId")
    public DrugItemsVO fandId(Integer diId){
        DrugItemsVO drugItemsVO = durgItemsService.fandId(diId);
        return drugItemsVO;
    }
}
