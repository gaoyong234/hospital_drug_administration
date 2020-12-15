package com.hospital_purchase.dao.drugInformation;

import com.hospital_purchase.pojo.Dictionaries;

import java.util.List;

public interface DictionariesInfoMapper {
    int deleteByPrimaryKey(Integer diId);

    int insert(Dictionaries record);

    int insertSelective(Dictionaries record);

    Dictionaries selectByPrimaryKey(Integer diId);

    int updateByPrimaryKeySelective(Dictionaries record);

    int updateByPrimaryKey(Dictionaries record);
    //查询质量层次
    List<Dictionaries> findQualityLevel();
    //查询药品类别
    List<Dictionaries> findDrugCategorys();
    //查询字典表里的医院级别信息
    List findDictionariesInfo();
}