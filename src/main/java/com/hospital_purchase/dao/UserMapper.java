package com.hospital_purchase.dao;

import com.hospital_purchase.pojo.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer usId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer usId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}