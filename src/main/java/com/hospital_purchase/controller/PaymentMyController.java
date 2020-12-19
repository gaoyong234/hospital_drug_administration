package com.hospital_purchase.controller;

import com.github.pagehelper.PageInfo;
import com.hospital_purchase.pojo.Payment;
import com.hospital_purchase.pojo.Storage;
import com.hospital_purchase.pojo.Supplier;
import com.hospital_purchase.service.PaymentMyService;
import com.hospital_purchase.util.Identities;
import com.hospital_purchase.vo.DrugItemsVO;
import com.hospital_purchase.vo.PaymentVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Date;

@Controller
@RequestMapping("payment")
public class PaymentMyController {

    @Autowired
    PaymentMyService paymentMyService;

    @RequestMapping("paymenthome")
    public String forPaymentHome(HttpSession httpSession){
        return "/payment/payment";
    }

    @RequestMapping("findPayment")
    @ResponseBody
    public PageInfo<PaymentVo> findAllPayment(@RequestParam(value = "pageNum",defaultValue = "1") Integer pageNum,
                                  @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize,
                                  PaymentVo payment){
        PageInfo<PaymentVo> payments = paymentMyService.fandPayment(pageNum, pageSize, payment);
        return payments;
    }

    @RequestMapping("addpayment")
    @ResponseBody
    public Integer addPayment(PaymentVo payment){
        payment.setPaymentNumber(Identities.randomLong("结算单"));
        return paymentMyService.addPayment(payment);
    }

}
