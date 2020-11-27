package com.hospital_purchase.dao;

import com.hospital_purchase.pojo.Payment;

public interface PaymentMapper {
    int deleteByPrimaryKey(Integer soId);

    int insert(Payment record);

    int insertSelective(Payment record);

    Payment selectByPrimaryKey(Integer soId);

    int updateByPrimaryKeySelective(Payment record);

    int updateByPrimaryKey(Payment record);
}