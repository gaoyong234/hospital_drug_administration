package com.hospital_purchase.dao;

import com.hospital_purchase.pojo.Storage;

public interface StorageMapper {
    int deleteByPrimaryKey(Integer stId);

    int insert(Storage record);

    int insertSelective(Storage record);

    Storage selectByPrimaryKey(Integer stId);

    int updateByPrimaryKeySelective(Storage record);

    int updateByPrimaryKey(Storage record);
}