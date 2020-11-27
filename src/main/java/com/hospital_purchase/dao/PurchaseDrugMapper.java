package com.hospital_purchase.dao;

import com.hospital_purchase.pojo.PurchaseDrug;

public interface PurchaseDrugMapper {
    int deleteByPrimaryKey(Integer pdId);

    int insert(PurchaseDrug record);

    int insertSelective(PurchaseDrug record);

    PurchaseDrug selectByPrimaryKey(Integer pdId);

    int updateByPrimaryKeySelective(PurchaseDrug record);

    int updateByPrimaryKey(PurchaseDrug record);
}