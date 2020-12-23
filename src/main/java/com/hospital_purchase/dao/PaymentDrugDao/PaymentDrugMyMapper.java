package com.hospital_purchase.dao.PaymentDrugDao;

import com.hospital_purchase.pojo.Payment;
import com.hospital_purchase.vo.PayDrugVo;
import com.hospital_purchase.vo.PaymentVo;

import java.util.List;

public interface PaymentDrugMyMapper {

    List<PayDrugVo> findAll(PayDrugVo payDrugVo);

}