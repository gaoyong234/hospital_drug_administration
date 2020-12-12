package com.hospital_purchase.service;

import com.github.pagehelper.PageInfo;
import com.hospital_purchase.vo.DrugItemsVO;
import com.hospital_purchase.vo.DrugItemsVoRead;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@Service
public interface DurgItemsService {

    PageInfo<DrugItemsVO> conditionfand(Integer pageNum, Integer pageSize, DrugItemsVO druglist);

    Integer addDrugItems(DrugItemsVO drugItems);

    DrugItemsVO fandId(Integer diId);

    Integer revampItems(DrugItemsVO drugItemsVO);

    Integer expurgate(Integer diId);

    void exportExcel(HttpServletResponse response) throws IOException;

    void loadtemplate(HttpServletResponse response) throws IOException;

    Integer readfile(DrugItemsVoRead drugitemsvo);

    List itemsdiCtion();
}
