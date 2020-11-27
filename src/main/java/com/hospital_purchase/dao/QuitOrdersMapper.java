package com.hospital_purchase.dao;

import com.hospital_purchase.pojo.QuitOrders;

public interface QuitOrdersMapper {
    int deleteByPrimaryKey(Integer srId);

    int insert(QuitOrders record);

    int insertSelective(QuitOrders record);

    QuitOrders selectByPrimaryKey(Integer srId);

    int updateByPrimaryKeySelective(QuitOrders record);

    int updateByPrimaryKey(QuitOrders record);
}