package com.hospital_purchase.dao.DictionariesDao;

import com.hospital_purchase.pojo.Dictionaries;

import java.util.List;

public interface DictionariesDaoMapper {
    //查所有父
    List selectParentDictionaries();
    //查所有父id下的所有
    List selectChildbyParentId(Integer dictionariesId);
    //添加
    Integer insertDictionaries(Dictionaries dictionaries);
    //删除
    Integer updateDictionariesDel(Integer dicId);
    //修改
    Integer updateDictionaries(Dictionaries dictionaries);
    //查所有
    List selectAllDictionaries();

}
