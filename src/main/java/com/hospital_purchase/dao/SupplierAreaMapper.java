package com.hospital_purchase.dao;

import com.hospital_purchase.pojo.SupplierArea;

public interface SupplierAreaMapper {
    int deleteByPrimaryKey(Integer saId);

    int insert(SupplierArea record);

    int insertSelective(SupplierArea record);

    SupplierArea selectByPrimaryKey(Integer saId);

    int updateByPrimaryKeySelective(SupplierArea record);

    int updateByPrimaryKey(SupplierArea record);
}