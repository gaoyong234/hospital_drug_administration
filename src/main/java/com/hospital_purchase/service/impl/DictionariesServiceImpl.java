package com.hospital_purchase.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hospital_purchase.dao.DictionariesDao.DictionariesDaoMapper;
import com.hospital_purchase.pojo.Dictionaries;
import com.hospital_purchase.service.DictionariesService;
import com.hospital_purchase.util.ReturnUtil;
import com.hospital_purchase.vo.DictionariesVO;
import com.hospital_purchase.vo.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class DictionariesServiceImpl implements DictionariesService {

    @Autowired
    private DictionariesDaoMapper dictionariesDaoMapper;

    @Override
    public List findParentDictionaries() {
        return dictionariesDaoMapper.selectParentDictionaries();
    }

    @Override
    public List findChildByParentId(Integer dictionariesId) {
        return dictionariesDaoMapper.selectChildByParentId(dictionariesId);
    }

    @Override
    public Message addDictionaries(Dictionaries dictionaries) {
        dictionaries.setCreateTime(new Date());
        Integer num = dictionariesDaoMapper.insertDictionaries(dictionaries);
        Message message = ReturnUtil.returnDataOperation("添加", num);
        return message;
    }

    @Override
    public Message removeDictionariesDel(Integer dicId) {
        Message message;
        Integer count = dictionariesDaoMapper.selectChildCount(dicId);
        if (count>0) {
            message = ReturnUtil.returnDataOperation("删除", 0);

        }else {
            Integer num = dictionariesDaoMapper.updateDictionariesDel(dicId);
            message = ReturnUtil.returnDataOperation("删除", num);
        }
        return message;
    }

    @Override
    public Message changeDictionaries(Dictionaries dictionaries) {
        dictionaries.setModifiedTime(new Date());
        Integer num = dictionariesDaoMapper.updateDictionaries(dictionaries);
        Message message = ReturnUtil.returnDataOperation("修改", num);
        return message;
    }

    @Override
    public PageInfo findAllDictionaries(Integer pageNum,Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List list = dictionariesDaoMapper.selectAllDictionaries();
        PageInfo<DictionariesVO> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public DictionariesVO findDictionariesById(Integer dicId) {
        return dictionariesDaoMapper.selectDictionariesById(dicId);
    }
}
