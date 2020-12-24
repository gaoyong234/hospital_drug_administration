package com.hospital_purchase.controller;

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
}