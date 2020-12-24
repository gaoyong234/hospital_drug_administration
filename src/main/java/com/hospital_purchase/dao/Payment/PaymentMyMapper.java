package com.hospital_purchase.dao.Payment;

import com.hospital_purchase.pojo.Payment;
import com.hospital_purchase.vo.PayDrugVo;
import com.hospital_purchase.vo.PaymentVo;

import java.util.List;

public interface PaymentMyMapper {

    List<Payment> findAllPayment(Payment payment);

    Integer addPayment(PaymentVo payment);

    List<PaymentVo> fandPayment(PaymentVo payment);

    Integer expurgate(Integer soId);

    PaymentVo findpayment(Integer soId);

    List<PayDrugVo> findAll(Integer hospitalId,Integer soId);
}