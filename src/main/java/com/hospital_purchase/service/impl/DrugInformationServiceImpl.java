package com.hospital_purchase.service.impl;

import com.hospital_purchase.dao.DrugItemsMapper;
import com.hospital_purchase.dao.DrugMessageMapper;
import com.hospital_purchase.pojo.DrugItems;
import com.hospital_purchase.service.DrugInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DrugInformationServiceImpl implements DrugInformationService {

    @Autowired
    private DrugItemsMapper drugItemsMapper;

    @Override
    public List<DrugItems> findDrugItemsInfo() {
        List<DrugItems> list = drugItemsMapper.FindDrugItemsInfo();
        return list;
    }
}
