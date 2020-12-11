package com.hospital_purchase.controller;

import com.github.pagehelper.PageInfo;
import com.hospital_purchase.pojo.PurchaseOrders;
import com.hospital_purchase.pojo.User;
import com.hospital_purchase.service.PurchaseOrdersService;
import com.hospital_purchase.vo.Message;
import com.hospital_purchase.vo.PurchaseOrdersVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;


@Controller
@RequestMapping("/PurchaseOrders")
public class PurchaseOrdersController {

    @Autowired
    private PurchaseOrdersService purchaseOrdersService;


    @RequestMapping(value = "/toPurchaseOrders", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public String toPurchaseOrders(){

        return "PurchaseOrders/purchaseOrders";
    }

    /**
     *  查询所有采购单
     *
     * @param pageNum 起始页
     * @param pageSize 每页显示多少条
     * @param purchaseOrders 查询条件
     * @return
     */
    @RequestMapping("/findAllPurchaseOrders")
    @ResponseBody
    public PageInfo findAllPurchaseOrders(Integer pageNum, Integer pageSize, PurchaseOrders purchaseOrders){
        return purchaseOrdersService.findAllPurchaseOrders(pageNum,pageSize,purchaseOrders);
    }

    /**
     *  修改采购单
     *
     * @param purchaseOrders
     * @return
     */
    @RequestMapping("/changePurchaseOrders")
    @ResponseBody
    public Message changePurchaseOrders(PurchaseOrders purchaseOrders){
        return purchaseOrdersService.changePurchaseOrders(purchaseOrders);
    }

    /**
     *  添加采购单
     * @param purchaseOrders 添加的采购单信息
     * @return
     */
    @RequestMapping("/addPurchaseOrders")
    @ResponseBody
    public Message addPurchaseOrders(PurchaseOrders purchaseOrders, HttpSession httpSession){
        System.out.println(purchaseOrders);
        User admin = (User) httpSession.getAttribute("admin");
        purchaseOrders.setHospitalId(admin.getHospitalId());

        return purchaseOrdersService.addPurchaseOrders(purchaseOrders);
    }

    /**
     *  删除某一采购单信息
     * @param poId
     * @return
     */
    @RequestMapping("/removePurchaseOrders")
    @ResponseBody
    public Message removePurchaseOrders(Integer poId){
        return purchaseOrdersService.removePurchaseOrders(poId);
    }


    /**
     *
     * @param poId 采购单id
     * @return 单挑采购单
     */
    @RequestMapping("/getOnePurchaseOrders")
    @ResponseBody
    public PurchaseOrdersVO getOnePurchaseOrders(Integer poId){

        return purchaseOrdersService.getPurchaseOrdersById(poId);
    }
}
