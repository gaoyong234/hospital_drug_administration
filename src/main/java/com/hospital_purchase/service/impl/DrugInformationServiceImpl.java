package com.hospital_purchase.service.impl;

import com.hospital_purchase.dao.DictionariesMapper;
import com.hospital_purchase.dao.drugInformation.DrugInformationMapper;
import com.hospital_purchase.dao.drugInformation.DrugMessageInformationMapper;
import com.hospital_purchase.pojo.Dictionaries;
import com.hospital_purchase.pojo.DrugItems;
import com.hospital_purchase.pojo.DrugMessage;
import com.hospital_purchase.service.DrugInformationService;
import com.hospital_purchase.vo.DrugInformationVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DrugInformationServiceImpl implements DrugInformationService {

    @Autowired
    private DrugInformationMapper drugInformationMapper;

    @Autowired
    private DictionariesMapper dictionariesMapper;

    @Autowired
    private DrugMessageInformationMapper drugMessageInformationMapper;

    @Override
    public List<DrugItems> findDrugItemsInfo() {
        List<DrugItems> list = drugInformationMapper.findDrugItemsInfo();
        return list;
    }

    @Override
    public List<DrugItems> findAllDrugInfoLike(DrugInformationVO drugInformationVO) {
        return drugInformationMapper.findAllDrugInfoLike(drugInformationVO);
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
        return drugInformationMapper.addDrugInformation(drugItems);
    }

    @Override
    public int addDrugMessageInfo(DrugMessage drugMessage) {
        return drugMessageInformationMapper.addDrugMessageInfo(drugMessage);
    }

    @Override
    public int updateDrugInformation(DrugItems drugItems) {
        return drugInformationMapper.updateByPrimaryKeySelective(drugItems);
    }

    @Override
    public int updateDrugMessageInformation(DrugMessage drugMessage) {
        return drugMessageInformationMapper.updateByPrimaryKeySelective(drugMessage);
    }

    @Override
    public int delDrugInformation(Integer id) {
        int i = 0;
        if (id != null && id != 0){
             //i = drugInformationMapper.deleteByPrimaryKey(id);
        }
        return i;
    }
}
