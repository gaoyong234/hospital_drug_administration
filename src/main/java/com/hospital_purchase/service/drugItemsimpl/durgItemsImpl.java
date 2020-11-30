package com.hospital_purchase.service.drugItemsimpl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hospital_purchase.dao.DictionariesMapper;
import com.hospital_purchase.dao.DrugItemsMapper;
import com.hospital_purchase.pojo.DrugItems;
import com.hospital_purchase.service.DurgItemsService;
import com.hospital_purchase.vo.DrugItemsVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class durgItemsImpl implements DurgItemsService {
    @Autowired
    private DrugItemsMapper drugItemsMapper;


    @Override
    public List<DrugItemsVO> inquireDurgItems() {
        List<DrugItemsVO> dr = drugItemsMapper.selectAll();
        return dr;
    }

    @Override
    public PageInfo<DrugItemsVO> conditionfand(Integer pageNum, Integer pageSize, DrugItems druglist) {
        PageHelper.startPage(pageNum,pageSize);
        List<DrugItemsVO> registrationOfCases = drugItemsMapper.conditionfand(druglist);
        PageInfo<DrugItemsVO> pageInfo = new PageInfo<DrugItemsVO>(registrationOfCases);

        return pageInfo;
    }

}
