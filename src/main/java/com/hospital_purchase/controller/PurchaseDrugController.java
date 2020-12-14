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
    @RequestMapping("/toDrugInformation")
    public String toDrugInformation(Integer puId,Model model){
        model.addAttribute("puId",puId);
        return "/purchaseDrug/AddPurchaseDrug";
    }

}
