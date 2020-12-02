package com.hospital_purchase.dao.drugInformation;

import com.hospital_purchase.pojo.DrugMessage;

public interface DrugMessageInformationMapper {
    int deleteByPrimaryKey(Integer dmId);

    int insert(DrugMessage record);

    int insertSelective(DrugMessage record);

    DrugMessage selectByPrimaryKey(Integer dmId);

    int updateByPrimaryKeySelective(DrugMessage record);

    int updateByPrimaryKey(DrugMessage record);
    //新增药品信息
    int addDrugMessageInfo(DrugMessage drugMessage);
}