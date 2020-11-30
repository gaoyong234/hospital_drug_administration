package com.hospital_purchase.service;

import com.hospital_purchase.pojo.DrugItems;

import java.util.List;

public interface DrugInformationService {

    //查询药品信息维护
    List<DrugItems> findDrugItemsInfo();
}
