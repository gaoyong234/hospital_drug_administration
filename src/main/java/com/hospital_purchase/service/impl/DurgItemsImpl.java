package com.hospital_purchase.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hospital_purchase.dao.drugitemsmydao.DrugItemsMyMapper;
import com.hospital_purchase.pojo.DrugItems;
import com.hospital_purchase.service.DurgItemsService;
import com.hospital_purchase.vo.DrugItemsVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
@Resource
public class DurgItemsImpl implements DurgItemsService {
    @Autowired
    private DrugItemsMyMapper drugItemsMyMapper;

    @Override
    public PageInfo<DrugItemsVO> conditionfand(Integer pageNum, Integer pageSize, DrugItemsVO druglist) {
        PageHelper.startPage(pageNum,pageSize);
        List<DrugItemsVO> registrationOfCases = drugItemsMyMapper.conditionfand(druglist);
        PageInfo<DrugItemsVO> pageInfo = new PageInfo<DrugItemsVO>(registrationOfCases);
        return pageInfo;
    }
}
