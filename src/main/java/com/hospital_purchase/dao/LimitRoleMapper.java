package com.hospital_purchase.dao;

import com.hospital_purchase.pojo.LimitRole;

public interface LimitRoleMapper {
    int deleteByPrimaryKey(Integer lrId);

    int insert(LimitRole record);

    int insertSelective(LimitRole record);

    LimitRole selectByPrimaryKey(Integer lrId);

    int updateByPrimaryKeySelective(LimitRole record);

    int updateByPrimaryKey(LimitRole record);
}