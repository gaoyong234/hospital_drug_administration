package com.hospital_purchase.dao;

import com.hospital_purchase.pojo.Dictionaries;

public interface DictionariesMapper {
    int deleteByPrimaryKey(Integer dicId);

    int insert(Dictionaries record);

    int insertSelective(Dictionaries record);

    Dictionaries selectByPrimaryKey(Integer dicId);

    int updateByPrimaryKeySelective(Dictionaries record);

    int updateByPrimaryKey(Dictionaries record);
}