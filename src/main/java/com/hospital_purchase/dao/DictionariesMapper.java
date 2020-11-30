package com.hospital_purchase.dao;

import com.hospital_purchase.pojo.Dictionaries;

import java.util.HashMap;

public interface DictionariesMapper {
    int deleteByPrimaryKey(Integer diId);

    int insert(Dictionaries record);

    int insertSelective(Dictionaries record);

    Dictionaries selectByPrimaryKey(Integer diId);

    int updateByPrimaryKeySelective(Dictionaries record);

    int updateByPrimaryKey(Dictionaries record);

}