package com.hospital_purchase.dao;

import com.hospital_purchase.pojo.PurchaseOrders;

public interface PurchaseOrdersMapper {
    int deleteByPrimaryKey(Integer poId);

    int insert(PurchaseOrders record);

    int insertSelective(PurchaseOrders record);

    PurchaseOrders selectByPrimaryKey(Integer poId);

    int updateByPrimaryKeySelective(PurchaseOrders record);

    int updateByPrimaryKey(PurchaseOrders record);
}