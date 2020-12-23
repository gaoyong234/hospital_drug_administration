package com.hospital_purchase.dao.drugInformation;
import com.hospital_purchase.common.DrugInformationDto;
import com.hospital_purchase.vo.DrugInfoVO;
import com.hospital_purchase.vo.DrugInformationExcelVO;
import com.hospital_purchase.pojo.DrugItems;
import com.hospital_purchase.vo.DrugInformationVO;
import com.hospital_purchase.vo.DrugMessageVO;

import java.util.List;

public interface DrugInformationMapper {

    int deleteByPrimaryKey(Integer diId);

    int insert(DrugItems record);

    int insertSelective(DrugItems record);

    DrugItems selectByPrimaryKey(Integer diId);

    int updateByPrimaryKeySelective(DrugItems record);

    int updateByPrimaryKey(DrugItems record);

    //查询药品信息维护
    List<DrugItems> findDrugItemsInfo();
    //模糊查询
    List<DrugItems> findAllDrugInfoLike(DrugInformationVO drugInformationVO);
    //新增药品信息
    int addDrugInformation(DrugItems drugItems);
    //删除药品信息
    int delDrugInformation(Integer id);

    List<DrugInformationExcelVO> selectAllDrugInformationDataVo();
    //gy模糊查询
    List<DrugMessageVO> findAllDrugInfo(DrugMessageVO DrugMessageVO);
    //根据id查单条
    DrugMessageVO selectDrugById(Integer id);
    //修改根据主键id查询数据
    DrugInfoVO queryDrugInfoById(Integer diId);
}