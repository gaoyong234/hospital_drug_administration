package com.hospital_purchase.dao;

import com.hospital_purchase.pojo.PurchaseDrugDorrelation;

public interface PurchaseDrugDorrelationMapper {
    int deleteByPrimaryKey(Integer dcId);

    int insert(PurchaseDrugDorrelation record);

    int insertSelective(PurchaseDrugDorrelation record);

    PurchaseDrugDorrelation selectByPrimaryKey(Integer dcId);

    int updateByPrimaryKeySelective(PurchaseDrugDorrelation record);

    int updateByPrimaryKey(PurchaseDrugDorrelation record);
}