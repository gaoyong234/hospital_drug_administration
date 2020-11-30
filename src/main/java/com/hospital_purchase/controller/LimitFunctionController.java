package com.hospital_purchase.controller;

import com.github.pagehelper.PageInfo;
import com.hospital_purchase.pojo.LimitFunction;
import com.hospital_purchase.service.LimitFunctionService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class LimitFunctionController {
    @Autowired
    private LimitFunctionService limitFunctionService;
    @RequestMapping("/toLimit")
    public String toLimit(){

        return "/limitFunction/limitAdd";
    }
    @RequestMapping("/addLimitFunction")
    @ResponseBody
    public int addLimit(LimitFunction limit){
        System.out.println(limit.getLimitName());

        return limitFunctionService.addLimit(limit);
    }
    @RequestMapping("/findAllParentLimit")
    @ResponseBody
    public List findAllParentLimit(){
        return limitFunctionService.findParentLimit();
    }

    @RequestMapping("/getOneLimitFunction")
    public String getOneLimitFunction(Integer id, Model model){
        LimitFunction oneLimitFunction = limitFunctionService.getOneLimitFunction(id);
        model.addAttribute("LimitFunction",oneLimitFunction);
        return "/limitFunction/changeLimit";

    }

    @RequestMapping("/findAllLimit")
    public String findAllLimit(@RequestParam(value = "pageNum",defaultValue = "1") Integer pageNum, @RequestParam(value = "pageSize",defaultValue = "5") Integer pageSize, Model model){
        PageInfo pageInfo = limitFunctionService.findAllLimitFunction(pageNum,pageSize);
        model.addAttribute("pageInfo",pageInfo);
        return "/limitFunction/AllLimitFunction";

    }
}
