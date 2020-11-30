package com.hospital_purchase.service;

import com.github.pagehelper.PageInfo;
import com.hospital_purchase.pojo.DrugItems;
import com.hospital_purchase.vo.DrugItemsVO;

import java.util.List;

public interface DurgItemsService {
 List<DrugItemsVO> inquireDurgItems();

    PageInfo<DrugItemsVO> conditionfand(Integer pageNum, Integer pageSize, DrugItems druglist);
}
