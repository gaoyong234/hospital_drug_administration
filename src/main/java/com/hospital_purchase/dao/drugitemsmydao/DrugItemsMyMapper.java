package com.hospital_purchase.dao.drugitemsmydao;

import com.hospital_purchase.pojo.DrugItems;
import com.hospital_purchase.vo.DrugItemsVO;
import com.hospital_purchase.vo.DrugItemsVoRead;

import java.util.List;

public interface DrugItemsMyMapper {

    List<DrugItemsVO> conditionfand(DrugItemsVO druglist);

    Integer addDrugItems(DrugItemsVO drugItems);

    DrugItemsVO fandId(Integer diId);

    Integer revamp(DrugItemsVO drugItemsVO);

    Integer expurgate(Integer diId);

    Integer readfile(DrugItemsVoRead drugitemsvo);
}