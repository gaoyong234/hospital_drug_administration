package com.hospital_purchase.service;

import com.github.pagehelper.PageInfo;
import com.hospital_purchase.pojo.DrugItems;
import com.hospital_purchase.vo.DrugItemsVO;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@Service
public interface DurgItemsService {

    PageInfo<DrugItemsVO> conditionfand(Integer pageNum, Integer pageSize, DrugItemsVO druglist);

    Integer addDrugItems(DrugItemsVO drugItems);

    DrugItemsVO fandId(Integer diId);

    Integer revampItems(DrugItemsVO drugItemsVO);

    Integer expurgate(Integer diId);

    void exportExcel(HttpServletResponse response) throws IOException;

    void loadtemplate(HttpServletResponse response) throws IOException;
}
