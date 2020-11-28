package com.hospital_purchase.dao;

import com.hospital_purchase.pojo.UserRole;

public interface UserRoleMapper {
    int deleteByPrimaryKey(Integer urId);

    int insert(UserRole record);

    int insertSelective(UserRole record);

    UserRole selectByPrimaryKey(Integer urId);

    int updateByPrimaryKeySelective(UserRole record);

    int updateByPrimaryKey(UserRole record);
}