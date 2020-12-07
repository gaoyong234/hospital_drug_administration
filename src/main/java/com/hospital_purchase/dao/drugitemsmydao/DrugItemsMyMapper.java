package com.hospital_purchase.dao.drugitemsmydao;

import com.hospital_purchase.pojo.DrugItems;
import com.hospital_purchase.vo.DrugItemsVO;

import java.util.List;

public interface DrugItemsMyMapper {
    int deleteByPrimaryKey(Integer diId);

    int insert(DrugItems record);

    int insertSelective(DrugItems record);

    DrugItems selectByPrimaryKey(Integer diId);

    int updateByPrimaryKeySelective(DrugItems record);

    int updateByPrimaryKey(DrugItems record);

    List<DrugItemsVO> conditionfand(DrugItemsVO druglist);

    DrugItems selectAll();

    Integer addDrugItems(DrugItems drugItems);

    DrugItemsVO fandId(Integer diId);
}