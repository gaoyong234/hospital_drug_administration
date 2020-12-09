package com.hospital_purchase.service;

import com.github.pagehelper.PageInfo;
import com.hospital_purchase.pojo.DrugItems;
import com.hospital_purchase.vo.DrugItemsVO;
import org.springframework.stereotype.Service;


@Service
public interface DurgItemsService {

    PageInfo<DrugItemsVO> conditionfand(Integer pageNum, Integer pageSize, DrugItemsVO druglist);

    Integer addDrugItems(DrugItemsVO drugItems);

    DrugItemsVO fandId(Integer diId);

    Integer revampItems(DrugItemsVO drugItemsVO);

    Integer expurgate(Integer diId);

//    Workbook exportExcel(String fileName, String[] arr);
}
