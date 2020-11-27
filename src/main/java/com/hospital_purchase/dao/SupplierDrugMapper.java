package com.hospital_purchase.dao;

import com.hospital_purchase.pojo.SupplierDrug;

public interface SupplierDrugMapper {
    int deleteByPrimaryKey(Integer sdId);

    int insert(SupplierDrug record);

    int insertSelective(SupplierDrug record);

    SupplierDrug selectByPrimaryKey(Integer sdId);

    int updateByPrimaryKeySelective(SupplierDrug record);

    int updateByPrimaryKey(SupplierDrug record);
}