package com.hospital_purchase.controller;

import com.github.pagehelper.PageInfo;
import com.hospital_purchase.common.PurchaseStorageDto;
import com.hospital_purchase.pojo.Storage;
import com.hospital_purchase.service.PurchaseStorageService;
import com.hospital_purchase.vo.PurchaseStorageVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
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
     * 查询采购入库单+分页+模糊查询
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

    /**
     * 按id查找采购多条数据
     * @param poId
     * @return
     */
    @ResponseBody
    @RequestMapping("/findPurchaseDataById")
    public List<PurchaseStorageVO> findPurchaseDataById(@RequestParam("poId") List<Integer> poId){
        return purchaseStorageService.findPurchaseDataById(poId);
    }

    @ResponseBody
    @RequestMapping(value = "/stockInPurchaseInfo")
    public Integer stockInPurchaseInfo(@RequestBody PurchaseStorageVO purchaseStorageVO){
        List<Storage> list = new ArrayList<>();
        for(PurchaseStorageDto purchaseStorageDto:purchaseStorageVO.getStorageList()){
            Storage storage = new Storage();
            storage.setStId(purchaseStorageDto.getStId());
            storage.setPurchaseOrderId(purchaseStorageDto.getPoId());
            storage.setStorageVolume(purchaseStorageDto.getStorageVolume());
            storage.setInvoice(purchaseStorageDto.getInvoice());
            storage.setDrugBatchNumber(purchaseStorageDto.getDrugBatchNumber());
            list.add(storage);
        }
        return purchaseStorageService.stockInPurchaseInfo(list);
    }
}
