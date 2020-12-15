package com.hospital_purchase.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 采购单——药品关联表
 */
@Controller
@RequestMapping("/PurchaseDrug")
public class PurchaseDrugController {
    /**
     * 去采购单页面
     * @param puId 采购单id
     * @param model
     * @return
     */
    @RequestMapping("/toDrugInformation")
    public String toDrugInformation(Integer puId,Model model){
        model.addAttribute("puId",puId);
        return "/purchaseDrug/AddPurchaseDrug";
    }

}
