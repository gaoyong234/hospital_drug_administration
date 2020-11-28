package com.hospital_purchase.dao;

import com.hospital_purchase.pojo.DrugItems;

import java.util.List;

public interface DrugItemsMapper {
    int deleteByPrimaryKey(Integer diId);

    int insert(DrugItems record);

    int insertSelective(DrugItems record);

    DrugItems selectByPrimaryKey(Integer diId);

    int updateByPrimaryKeySelective(DrugItems record);

    int updateByPrimaryKey(DrugItems record);

    List<DrugItems> selectAll();
}