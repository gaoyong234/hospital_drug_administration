package com.hospital_purchase.service;

import com.github.pagehelper.PageInfo;
import com.hospital_purchase.pojo.Dictionaries;
import com.hospital_purchase.vo.DictionariesVO;
import com.hospital_purchase.vo.Message;

import java.util.List;

public interface DictionariesService {


    //查所有父
    List findParentDictionaries();
    //查所有父id下的所有
    List findChildByParentId(Integer dictionariesId);
    //添加
    Message addDictionaries(Dictionaries dictionaries);
    //删除
    Message removeDictionariesDel(Integer dicId);
    //修改
    Message changeDictionaries(Dictionaries dictionaries);

    PageInfo findAllDictionaries(Integer pageNum,Integer pageSize,Dictionaries dictionaries);

    DictionariesVO findDictionariesById(Integer dicId);

}
