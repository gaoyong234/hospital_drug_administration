package com.hospital_purchase.dao;

import com.hospital_purchase.pojo.Limit;

public interface LimitMapper {
    int deleteByPrimaryKey(Integer liId);

    int insert(Limit record);

    int insertSelective(Limit record);

    Limit selectByPrimaryKey(Integer liId);

    int updateByPrimaryKeySelective(Limit record);

    int updateByPrimaryKey(Limit record);
}