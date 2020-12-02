package com.hospital_purchase.service;

import com.hospital_purchase.pojo.Dictionaries;
import com.hospital_purchase.pojo.DrugItems;
import com.hospital_purchase.vo.DrugInformationVO;

import java.util.List;

public interface DrugInformationService {

    //查询药品信息维护
    List<DrugItems> findDrugItemsInfo();
    //模糊查询
    List<DrugItems> findAllDrugInfoLike(DrugInformationVO drugInformationVO);
    //查询质量层次
    List<Dictionaries> findQualityLevel();
    //查询药品类别
    List<Dictionaries> findDrugCategorys();
    //新增药品信息
    int addDrugInformation(DrugItems drugItems);
}
