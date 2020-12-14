package com.hospital_purchase.service.impl;

import com.alibaba.excel.EasyExcelFactory;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.metadata.Sheet;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hospital_purchase.dao.DictionariesDao.DictionariesDaoMapper;
import com.hospital_purchase.dao.drugitemsmydao.DrugItemsMyMapper;
import com.hospital_purchase.service.DurgItemsService;
import com.hospital_purchase.util.EasyExcelUtil;
import com.hospital_purchase.vo.DrugItemsVO;
import com.hospital_purchase.vo.DrugItemsVoRead;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Service
@Resource
public class DurgItemsImpl implements DurgItemsService {
    @Autowired
    private DrugItemsMyMapper drugItemsMyMapper;

    @Autowired
    private DictionariesDaoMapper dictionariesDaoMapper;

    @Override
    public PageInfo<DrugItemsVO> conditionfand(Integer pageNum, Integer pageSize, DrugItemsVO druglist) {
        PageHelper.startPage(pageNum,pageSize);
        List<DrugItemsVO> registrationOfCases = drugItemsMyMapper.conditionfand(druglist);
        PageInfo<DrugItemsVO> pageInfo = new PageInfo<DrugItemsVO>(registrationOfCases);
        return pageInfo;
    }

    @Override
    public Integer addDrugItems(DrugItemsVO drugItems) {
        return drugItemsMyMapper.addDrugItems(drugItems);
    }

    @Override
    public DrugItemsVO fandId(Integer diid) {
        return drugItemsMyMapper.fandId(diid);
    }

    @Override
    public Integer revampItems(DrugItemsVO drugItemsVO) {
        return drugItemsMyMapper.revamp(drugItemsVO);
    }

    @Override
    public Integer expurgate(Integer diId) {
        return drugItemsMyMapper.expurgate(diId);
    }

    @Override
    public void exportExcel(HttpServletResponse response) throws IOException {
        response.setContentType("application/octet-stream; charset=utf-8");
        response.setHeader("Content-disposition","attachment;filename="+"allItems.xlsx");
        ServletOutputStream out = response.getOutputStream();

        ExcelWriter writer = EasyExcelFactory.getWriter(out);
        List<DrugItemsVO> drugItemss = drugItemsMyMapper.conditionfand(null);
        Sheet sheet = new Sheet(1, 0, DrugItemsVO.class);

        sheet.setSheetName("药品品目");
        writer.write(drugItemss,sheet);
        writer.finish();
        out.close();
    }

    @Override
    public void loadtemplate(HttpServletResponse response) throws IOException {
        EasyExcelUtil.loadtemplate(response);
    }

    @Override
    public Integer readfile(DrugItemsVoRead drugitemsvo) {
        Integer readfile = drugItemsMyMapper.readfile(drugitemsvo);
        return readfile;
    }

    @Override
    public List itemsdiCtion() {
        /*dictionariesDaoMapper.selectAllDictionaries();*/
        return null;
    }
}
