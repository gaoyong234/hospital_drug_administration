package com.hospital_purchase.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import com.hospital_purchase.pojo.User;
import com.hospital_purchase.service.PaymentDrugService;
import com.hospital_purchase.vo.PayDrugVo;
import com.hospital_purchase.vo.PaymentVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("paydrug")
public class PaymentDrugMyController {
    @Autowired
    PaymentDrugService paymentDrugService;

    @RequestMapping("findAll")
    @ResponseBody
    public PageInfo<PayDrugVo> findAllPayDrugVo(@RequestParam(value = "pageNum",defaultValue = "1") Integer pageNum,
                                              @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize,
                                              PayDrugVo payDrugVo,HttpSession httpSession){
        payDrugVo.setHospitalId(getHospitalId(httpSession));

        PageInfo<PayDrugVo> payments = paymentDrugService.fandAll(pageNum, pageSize, payDrugVo);
        return payments;
    }
    
    public Integer getHospitalId(HttpSession httpSession){
        User admin = (User) httpSession.getAttribute("admin");
        return admin.getHospitalId();
    }

    @RequestMapping("addPaymentDrug")
    @ResponseBody
    public Integer addPaymentDrug(@RequestParam(value = "addList")List addList,@RequestParam(value = "soId") Integer soId){
//        System.out.println(addList);

        Integer demo=0;
        for (int i = 1; i < addList.size(); i++) {
            JSONObject jsonObject = JSONObject.parseObject(addList.get(i).toString());
            PayDrugVo payDrugVo = new PayDrugVo();
            payDrugVo.setPurchaseId((Integer) jsonObject.get("pdId"));
            payDrugVo.setDrugId((Integer) jsonObject.get("drugId"));
            payDrugVo.setSoId(soId);
            Integer integer=paymentDrugService.addPaymentDrug(payDrugVo);

        }


        return demo;
    }
}
