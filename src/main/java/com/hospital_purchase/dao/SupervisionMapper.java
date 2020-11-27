package com.hospital_purchase.dao;

import com.hospital_purchase.pojo.Supervision;

public interface SupervisionMapper {
    int deleteByPrimaryKey(Integer ssId);

    int insert(Supervision record);

    int insertSelective(Supervision record);

    Supervision selectByPrimaryKey(Integer ssId);

    int updateByPrimaryKeySelective(Supervision record);

    int updateByPrimaryKey(Supervision record);
}