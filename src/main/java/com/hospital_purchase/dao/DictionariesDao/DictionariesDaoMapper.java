package com.hospital_purchase.dao.DictionariesDao;

import com.hospital_purchase.pojo.Dictionaries;
import com.hospital_purchase.pojo.Supplier;
import com.hospital_purchase.vo.DictionariesVO;

import java.util.List;

public interface DictionariesDaoMapper {
    //查所有父
    List selectParentDictionaries();
    //查所有父id下的所有
    List selectChildByParentId(Integer dictionariesId);
    //添加
    Integer insertDictionaries(Dictionaries dictionaries);
    //删除
    Integer updateDictionariesDel(Integer dicId);
    //修改
    Integer updateDictionaries(Dictionaries dictionaries);
    //查所有
    List selectAllDictionaries(Dictionaries dictionaries);

    //查单条
    DictionariesVO selectDictionariesById(Integer dicId);
    //查该id下是否有子
    Integer selectChildCount(Integer dictionariesId);

}
