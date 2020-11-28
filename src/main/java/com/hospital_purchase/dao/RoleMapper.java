package com.hospital_purchase.dao;

import com.hospital_purchase.pojo.Role;

public interface RoleMapper {
    int deleteByPrimaryKey(Integer roId);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Integer roId);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
}