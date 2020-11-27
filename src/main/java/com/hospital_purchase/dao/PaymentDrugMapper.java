package com.hospital_purchase.dao;

import com.hospital_purchase.pojo.PaymentDrug;

public interface PaymentDrugMapper {
    int deleteByPrimaryKey(Integer pdId);

    int insert(PaymentDrug record);

    int insertSelective(PaymentDrug record);

    PaymentDrug selectByPrimaryKey(Integer pdId);

    int updateByPrimaryKeySelective(PaymentDrug record);

    int updateByPrimaryKey(PaymentDrug record);
}