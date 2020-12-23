package com.hospital_purchase.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hospital_purchase.common.DrugInformationDto;
import com.hospital_purchase.util.DrugInformationTemplateUtil;
import com.hospital_purchase.vo.DrugInfoVO;
import com.hospital_purchase.vo.DrugInformationExcelVO;
import com.hospital_purchase.dao.drugInformation.DictionariesInfoMapper;
import com.hospital_purchase.dao.drugInformation.DrugInformationMapper;
import com.hospital_purchase.dao.drugInformation.DrugMessageInformationMapper;
import com.hospital_purchase.pojo.Dictionaries;
import com.hospital_purchase.pojo.DrugItems;
import com.hospital_purchase.pojo.DrugMessage;
import com.hospital_purchase.service.DrugInformationService;
import com.hospital_purchase.util.ExcelWriteUtil;
import com.hospital_purchase.vo.DrugInformationVO;
import com.hospital_purchase.vo.DrugMessageVO;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Service
public class DrugInformationServiceImpl implements DrugInformationService {

    @Autowired
    private DrugInformationMapper drugInformationMapper;

    @Autowired
    private DictionariesInfoMapper dictionariesMapper;

    @Autowired
    private DrugMessageInformationMapper drugMessageInformationMapper;

    @Override
    public List<DrugItems> findDrugItemsInfo() {
        List<DrugItems> list = drugInformationMapper.findDrugItemsInfo();
        return list;
    }

    @Override
    public PageInfo<DrugItems> findAllDrugInfoLike(Integer pageNum,Integer pageSize,DrugInformationVO drugInformationVO) {
        PageHelper.startPage(pageNum,pageSize);
        List<DrugItems> drugItemsList = drugInformationMapper.findAllDrugInfoLike(drugInformationVO);
        PageInfo<DrugItems> pageInfo = new PageInfo<>(drugItemsList);
        return pageInfo;
    }

    @Override
    public List<Dictionaries> findQualityLevel() {
        return dictionariesMapper.findQualityLevel();
    }

    @Override
    public List<Dictionaries> findDrugCategorys() {
        return dictionariesMapper.findDrugCategorys();
    }

    @Override
    public int addDrugInformation(DrugItems drugItems) {
        return drugInformationMapper.addDrugInformation(drugItems);
    }

    @Override
    public int addDrugMessageInfo(DrugMessage drugMessage) {
        return drugMessageInformationMapper.addDrugMessageInfo(drugMessage);
    }

    @Override
    public int updateDrugInformation(DrugItems drugItems) {
        return drugInformationMapper.updateByPrimaryKeySelective(drugItems);
    }

    @Override
    public int updateDrugMessageInformation(DrugMessage drugMessage) {
        return drugMessageInformationMapper.updateByPrimaryKeySelective(drugMessage);
    }

    @Override
    public int delDrugInformation(Integer id) {
        int i = 0;
        if (id != null && id != 0){
             i = drugInformationMapper.delDrugInformation(id);
        }
        return i;
    }

    @Override
    public Workbook ExportAllDrugInformationDataVo(String fileName,String henders[],String privateMethods[]) {
        List<DrugInformationExcelVO> drugInformations = drugInformationMapper.selectAllDrugInformationDataVo();
        ExcelWriteUtil<DrugInformationExcelVO> writeUtil = new ExcelWriteUtil<>();
        Workbook workBook = writeUtil.getWorkBook(fileName, henders, drugInformations, privateMethods);
        return workBook;
    }

    @Override
    public void downloadTemplate(HttpServletResponse response) throws IOException {
        DrugInformationTemplateUtil.loadtemplate(response);
    }

    @Override
    public PageInfo<DrugMessageVO> findAllDrugInfo(Integer pageNum, Integer pageSize, DrugMessageVO DrugMessageVO) {
        PageHelper.startPage(pageNum,pageSize);
        List<DrugMessageVO> drugItemsList = drugInformationMapper.findAllDrugInfo(DrugMessageVO);
        PageInfo<DrugMessageVO > pageInfo = new PageInfo<DrugMessageVO>(drugItemsList);
        return pageInfo;
    }

    @Override
    public DrugMessageVO findDrugById(Integer id) {
        return drugInformationMapper.selectDrugById(id);
    }

    @Override
    public DrugInfoVO queryDrugInfoById(Integer diId) {
        return drugInformationMapper.queryDrugInfoById(diId);
    }
}
