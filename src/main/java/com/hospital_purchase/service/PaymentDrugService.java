package com.hospital_purchase.service;

import com.github.pagehelper.PageInfo;
import com.hospital_purchase.vo.PayDrugVo;
import org.springframework.stereotype.Service;

@Service
public interface PaymentDrugService {
    PageInfo<PayDrugVo> fandAll(Integer pageNum, Integer pageSize, PayDrugVo payDrugVo);

    Integer addPaymentDrug(PayDrugVo payDrugVo);
}
