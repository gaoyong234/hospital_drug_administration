package com.hospital_purchase.dao;

import com.hospital_purchase.pojo.DrugMessage;

public interface DrugMessageMapper {
    int deleteByPrimaryKey(Integer dmId);

    int insert(DrugMessage record);

    int insertSelective(DrugMessage record);

    DrugMessage selectByPrimaryKey(Integer dmId);

    int updateByPrimaryKeySelective(DrugMessage record);

    int updateByPrimaryKey(DrugMessage record);
}