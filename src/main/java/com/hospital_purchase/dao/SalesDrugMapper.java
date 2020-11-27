package com.hospital_purchase.dao;

import com.hospital_purchase.pojo.SalesDrug;

public interface SalesDrugMapper {
    int deleteByPrimaryKey(Integer drId);

    int insert(SalesDrug record);

    int insertSelective(SalesDrug record);

    SalesDrug selectByPrimaryKey(Integer drId);

    int updateByPrimaryKeySelective(SalesDrug record);

    int updateByPrimaryKey(SalesDrug record);
}