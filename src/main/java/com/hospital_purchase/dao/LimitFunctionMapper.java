package com.hospital_purchase.dao;

import com.hospital_purchase.pojo.LimitFunction;

public interface LimitFunctionMapper {
    int deleteByPrimaryKey(Integer lfId);

    int insert(LimitFunction record);

    int insertSelective(LimitFunction record);

    LimitFunction selectByPrimaryKey(Integer lfId);

    int updateByPrimaryKeySelective(LimitFunction record);

    int updateByPrimaryKey(LimitFunction record);
}