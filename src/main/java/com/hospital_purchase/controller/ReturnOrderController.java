package com.hospital_purchase.controller;

import com.github.pagehelper.PageInfo;
import com.hospital_purchase.pojo.QuitOrders;
import com.hospital_purchase.pojo.User;
import com.hospital_purchase.service.ReturnOrderService;
import com.hospital_purchase.vo.PurchaseStorageVO;
import com.hospital_purchase.vo.ReturnOrderVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/returnOrder")
public class ReturnOrderController {

    @Autowired
    private ReturnOrderService returnOrderService;

    /**
     * 跳转到创建退货单界面
     * @return
     */
    @RequestMapping("/toReturnOrderInterface")
    public String toReturnOrderInterface(){
        return "/returnOrder/returnOrder";
    }

    /**
     * 跳转到退货单维护界面
     * @return
     */
    @RequestMapping("/toReturnOrderMaintain")
    public String toReturnOrderMaintain(){
        return "/returnOrder/returnOrderMaintain";
    }

    /**
     * 查询本医院已入库且未退货的药品信息
     * @param pageNum
     * @param pageSize
     * @param returnOrderVO
     * @return
     */
    @ResponseBody
    @RequestMapping("/findReturnOrderDrugInfo")
    public PageInfo<ReturnOrderVO> findReturnOrderDrugInfo(@RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum,
                                                           @RequestParam(value = "pageSiae",defaultValue = "5")Integer pageSize,
                                                           ReturnOrderVO returnOrderVO){

        return returnOrderService.findReturnOrderDrugInfo(pageNum,pageSize,returnOrderVO);
    }

    @ResponseBody
    @RequestMapping("/addReturnOrderInfo")
    public Integer addReturnOrderInfo(){
        return null;
    }

    /*@ResponseBody
    @RequestMapping("/addReturnOrder")*/
    public Integer addReturnOrder(QuitOrders quitOrders, HttpSession httpSession){
        User admin = (User) httpSession.getAttribute("admin");
        quitOrders.setHospitalId(admin.getHospitalId());
        return returnOrderService.addReturnOrder(quitOrders);
    }

}
