package com.hospital_purchase.service.impl;

import com.hospital_purchase.dao.DictionariesMapper;
import com.hospital_purchase.dao.DrugItemsMapper;
import com.hospital_purchase.dao.DrugMessageMapper;
import com.hospital_purchase.pojo.Dictionaries;
import com.hospital_purchase.pojo.DrugItems;
import com.hospital_purchase.service.DrugInformationService;
import com.hospital_purchase.vo.DrugInformationVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DrugInformationServiceImpl implements DrugInformationService {

    @Autowired
    private DrugItemsMapper drugItemsMapper;

    @Autowired
    private DictionariesMapper dictionariesMapper;

    @Override
    public List<DrugItems> findDrugItemsInfo() {
        List<DrugItems> list = drugItemsMapper.FindDrugItemsInfo();
        return list;
    }

    @Override
    public List<DrugItems> findAllDrugInfoLike(DrugInformationVO drugInformationVO) {
        return drugItemsMapper.findAllDrugInfoLike(drugInformationVO);
    }

    @Override
    public List<Dictionaries> findQualityLevel() {
        return dictionariesMapper.findQualityLevel();
    }

    @Override
    public List<Dictionaries> findDrugCategorys() {
        return dictionariesMapper.findDrugCategorys();
    }

    @Override
    public int addDrugInformation(DrugItems drugItems) {
        return drugItemsMapper.addDrugInformation(drugItems);
    }
}
