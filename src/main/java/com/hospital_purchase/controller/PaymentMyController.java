package com.hospital_purchase.controller;

import com.hospital_purchase.pojo.Storage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("payment")
public class PaymentMyController {
    @RequestMapping("paymenthome")
    public String forPaymentHome(){
        return "/payment/payment";
    }

}
