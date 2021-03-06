package com.hospital_purchase.service;

import com.github.pagehelper.PageInfo;
import com.hospital_purchase.common.DrugInformationDto;
import com.hospital_purchase.pojo.Dictionaries;
import com.hospital_purchase.pojo.DrugItems;
import com.hospital_purchase.pojo.DrugMessage;
import com.hospital_purchase.vo.DrugInfoVO;
import com.hospital_purchase.vo.DrugInformationVO;
import com.hospital_purchase.vo.DrugMessageVO;
import org.apache.poi.ss.usermodel.Workbook;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public interface DrugInformationService {

    //查询药品信息维护
    List<DrugItems> findDrugItemsInfo();
    //模糊查询
    PageInfo<DrugItems> findAllDrugInfoLike(Integer pageNum, Integer pageSize, DrugInformationVO drugInformationVO);
    //查询质量层次
    List<Dictionaries> findQualityLevel();
    //查询药品类别
    List<Dictionaries> findDrugCategorys();
    //新增药品信息
    int addDrugInformation(DrugItems drugItems);
    int addDrugMessageInfo(DrugMessage drugMessage);
    //修改药品信息
    int updateDrugInformation(DrugItems drugItems);
    int updateDrugMessageInformation(DrugMessage drugMessage);
    //删除药品信息
    int delDrugInformation(Integer id);
    //导入全部药品信息
    Workbook ExportAllDrugInformationDataVo(String fileName, String henders[], String privateMethods[]);
    //导入下载模板excel
    void downloadTemplate(HttpServletResponse response) throws IOException;
    //gy模糊查询
    PageInfo<DrugMessageVO> findAllDrugInfo(Integer pageNum,Integer pageSize,DrugMessageVO drugMessageVO);
    //gy查单条
    DrugMessageVO findDrugById(Integer id);
    //修改根据主键id查询数据
    DrugInfoVO queryDrugInfoById(Integer diId);
}
