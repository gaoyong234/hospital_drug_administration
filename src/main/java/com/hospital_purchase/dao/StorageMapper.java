package com.hospital_purchase.dao;

import com.hospital_purchase.pojo.Storage;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StorageMapper {
    int deleteByPrimaryKey(Integer stId);

    int insert(Storage record);

    int insertSelective(Storage record);

    Storage selectByPrimaryKey(Integer stId);

    int updateByPrimaryKeySelective(Storage record);

    int updateByPrimaryKey(Storage record);

    Integer stockInPurchaseInfo(@Param("list") List<Storage> list);
}