package com.hospital_purchase.controller;

import com.github.pagehelper.PageInfo;
import com.hospital_purchase.pojo.LimitFunction;
import com.hospital_purchase.service.LimitFunctionService;
import com.hospital_purchase.vo.LimitFunctionVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/LimitFunctionController")
public class LimitFunctionController {
    @Autowired
    private LimitFunctionService limitFunctionService;
    @RequestMapping("/toLimit")
    public String toLimit(){

        return "/limitFunction/AllLimitFunction1";
    }
    @RequestMapping("/toAddLimit")
    public ModelAndView toAddLimit(Integer roId){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/limitFunction/RoleAddLimit");
        modelAndView.addObject("roId",roId);
        return modelAndView;
    }
    @RequestMapping("/addLimitFunction")
    @ResponseBody
    public int addLimit(LimitFunction limit){

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
    @RequestMapping("/getAllLimit")
    @ResponseBody
    public List<LimitFunctionVO> getAllLimit(){
        return limitFunctionService.getAllLimitFunction();
    }
    @RequestMapping("/findAllLimit")
    @ResponseBody
    public PageInfo findAllLimit(@RequestParam(value = "pageNum",defaultValue = "1") Integer pageNum, @RequestParam(value = "pageSize",defaultValue = "5") Integer pageSize, Model model){
        PageInfo pageInfo = limitFunctionService.findAllLimitFunction(pageNum,pageSize);

        return pageInfo;
    }

    @RequestMapping("/changeLimitFunction")
    @ResponseBody
    public Integer changeLimitFunction(LimitFunction limitFunction){
        System.out.println(limitFunction);
        return limitFunctionService.changeLimit(limitFunction);
    }

    @RequestMapping("/removeLimitFunction")
    @ResponseBody
    public Integer removeLimitFunction(Integer id){
        return limitFunctionService.removeLimitFunction(id);
    }

}
