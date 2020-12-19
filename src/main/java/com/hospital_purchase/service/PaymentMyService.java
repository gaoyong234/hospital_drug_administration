package com.hospital_purchase.service;

import com.github.pagehelper.PageInfo;
import com.hospital_purchase.pojo.Payment;
import com.hospital_purchase.vo.PaymentVo;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface PaymentMyService {
    List<Payment> findAllPayment(Payment payment);

    Integer addPayment(PaymentVo payment);

    PageInfo<PaymentVo> fandPayment(Integer pageNum, Integer pageSize, PaymentVo payment);

    Integer expurgate(Integer soId);

    PaymentVo findpayment(Integer soId);
}
