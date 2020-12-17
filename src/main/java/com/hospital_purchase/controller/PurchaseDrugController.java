package com.hospital_purchase.controller;
import com.github.pagehelper.PageInfo;
import com.hospital_purchase.pojo.PurchaseDrug;
import com.hospital_purchase.service.PurchaseDrugService;
import com.hospital_purchase.vo.Message;
import com.hospital_purchase.vo.PurchaseDrugVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


/**
 * 采购单——药品关联表
 */
@Controller
@RequestMapping("/PurchaseDrug")
public class PurchaseDrugController {
    @Autowired
    private PurchaseDrugService purchaseDrugService;
    /**
     * 去采购单页面
     * @param poId 采购单id
     * @return
     */
    @RequestMapping("/toDrugInformation")
    public ModelAndView toDrugInformation(Integer poId){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/purchaseDrug/findPurchaseDrug");
        modelAndView.addObject("poId",poId);
        return modelAndView;
    }
    @RequestMapping("/toAddPurchaseDrug")
    public ModelAndView toAddPurchaseDrug(Integer purchaseId){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/purchaseDrug/addPurchaseDrug");
        modelAndView.addObject("purchaseId",purchaseId);
        return modelAndView;
    }

    /**
     * 查采购单下的所有药品信息
     * @param pageNum 起始页
     * @param pageSize 页面大小
     * @param purchaseDrugVO 模糊查询条件
     * @return 查询的pageInfo
     */
    @RequestMapping("/findAllDrugByPurchase")
    @ResponseBody
    public PageInfo<PurchaseDrugVO> findAllDrugByPurchase(@RequestParam(value = "pageNum",defaultValue = "1") Integer pageNum,
                                                     @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize, PurchaseDrugVO purchaseDrugVO){
        return purchaseDrugService.findAllDrugByPurchase(pageNum,pageSize,purchaseDrugVO);
    }

    /**
     * 添加药品 有问题
     * @param purchaseDrug 药品信息
     * @return 是否成功信息
     */
    @RequestMapping("/addPurchaseDrug")
    @ResponseBody
    public Message addPurchaseDrug(PurchaseDrug purchaseDrug){
        return purchaseDrugService.addPurchaseDrug(purchaseDrug);
    }

    /**
     *  删除药品 有问题
     * @param pdId 关联表id
     * @return 是否成功信息
     */
    @RequestMapping("/removeUpdatePurchaseDrug")
    @ResponseBody
    public Message removeUpdatePurchaseDrug(Integer pdId){
        return purchaseDrugService.removeUpdatePurchaseDrug(pdId);
    }

    /**
     *  修改信息   有问题
     * @param purchaseDrug
     * @return
     */
    @RequestMapping("/changePurchaseDrug")
    @ResponseBody
    public Message changePurchaseDrug(PurchaseDrug purchaseDrug){
        return purchaseDrugService.changePurchaseDrug(purchaseDrug);
    }

    /**
     * 查询单条
     * @param pdId 关联表id
     * @return 单条信息
     */
    @RequestMapping("/findPurchaseDrug")
    @ResponseBody
    public PurchaseDrugVO findPurchaseDrug(Integer pdId){
        return purchaseDrugService.findPurchaseDrug(pdId);

    }

}
