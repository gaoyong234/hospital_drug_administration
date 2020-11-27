package com.hospital_purchase.dao;

import com.hospital_purchase.pojo.Supplier;

public interface SupplierMapper {
    int deleteByPrimaryKey(Integer spId);

    int insert(Supplier record);

    int insertSelective(Supplier record);

    Supplier selectByPrimaryKey(Integer spId);

    int updateByPrimaryKeySelective(Supplier record);

    int updateByPrimaryKey(Supplier record);
}