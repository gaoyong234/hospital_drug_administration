package com.hospital_purchase.dao.hospitalManageDao;

import com.hospital_purchase.pojo.Hospital;
import com.hospital_purchase.vo.HospitalVO;

import java.util.List;

public interface HospitalManageMapper {
    int deleteByPrimaryKey(Integer hpId);

    int insert(Hospital record);

    int insertSelective(Hospital record);

    HospitalVO selectByPrimaryKey(Integer hpId);

    int updateByPrimaryKeySelective(Hospital hospital);

    int updateByPrimaryKey(Hospital record);
    //查询+模糊查询+分页
    List<HospitalVO> findHospital(HospitalVO hospitalList);
    //删除医院信息
    Integer delHospitalInfo(int hpId);
}