package com.hospital_purchase.controller;

import com.hospital_purchase.pojo.DrugItems;
import com.hospital_purchase.service.DrugInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class DrugInformationController {

    @Autowired
    private DrugInformationService drugInformationService;

    /**
     * 2020/11/30
     * 跳转药品信息页面（drugInformation）
     * @return
     */
    @RequestMapping("/toDrugInformation")
    public String toDrugInformation() {
        return "druginfo/drugInformation";
    }

    /**
     * 2020/11/30
     * 查询药品信息维护
     * @param model
     * @return
     */
    @ResponseBody
    @RequestMapping("/findDrugItemsInfo")
    public List<DrugItems> findDrugItemsInfo(Model model){
        List<DrugItems> list = drugInformationService.findDrugItemsInfo();
        model.addAttribute("lists",list);
        return list;
    }
}
