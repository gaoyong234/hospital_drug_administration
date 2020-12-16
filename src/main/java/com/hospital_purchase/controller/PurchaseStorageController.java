package com.hospital_purchase.controller;

import com.github.pagehelper.PageInfo;
import com.hospital_purchase.service.PurchaseStorageService;
import com.hospital_purchase.vo.PurchaseStorageVO;
import com.hospital_purchase.vo.SupplierVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/purchaseStorage")
public class PurchaseStorageController {

    @Autowired
    private PurchaseStorageService purchaseStorageService;

    /**
     * 跳转到采购入库界面
     * @return
     */
    @RequestMapping("/toPurchaseStorage")
    public String toPurchaseStorage(){
        return "purchaseDrug/purchaseStorage";
    }

    /**
     * 查询采购入库单+分页
     * @param pageNum
     * @param pageSize
     * @param purchaseStorageVO
     * @return
     */
    @ResponseBody
    @RequestMapping("/findPurchaseStorage")
    public PageInfo<PurchaseStorageVO> findPurchaseStorage(@RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum,
                                                           @RequestParam(value = "pageSize",defaultValue = "5")Integer pageSize,
                                                           PurchaseStorageVO purchaseStorageVO){
        PageInfo<PurchaseStorageVO> purchaseStorage = purchaseStorageService.findPurchaseStorage(pageNum, pageSize, purchaseStorageVO);
        return purchaseStorage;
    }

}
