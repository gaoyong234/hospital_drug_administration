package com.hospital_purchase.service;

import com.github.pagehelper.PageInfo;
import com.hospital_purchase.pojo.DrugItems;
import com.hospital_purchase.vo.DrugItemsVO;
import org.springframework.stereotype.Service;


@Service
public interface DurgItemsService {

    PageInfo<DrugItemsVO> conditionfand(Integer pageNum, Integer pageSize, DrugItems druglist);


//    Workbook exportExcel(String fileName, String[] arr);
}
