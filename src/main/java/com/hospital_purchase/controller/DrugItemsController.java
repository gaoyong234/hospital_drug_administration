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
    public Integer addDrugItems(DrugItemsVO drugItems){
        System.out.println(drugItems);
        System.out.println("=======================");
        Integer integer = durgItemsService.addDrugItems(drugItems);
        return integer;
    }

    @RequestMapping("fandId")
    @ResponseBody
    public DrugItemsVO fandId(DrugItemsVO diId){
        DrugItemsVO drugItemsVO=null;
        drugItemsVO = durgItemsService.fandId(diId);
        if (drugItemsVO==null){
            drugItemsVO=new DrugItemsVO();
            drugItemsVO.setDiId("0");
        }
        return drugItemsVO;
    }
}
