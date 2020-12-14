package com.hospital_purchase.dao.hospitalManageDao;

import com.hospital_purchase.pojo.Hospital;

import java.util.List;

public interface HospitalManageMapper {
    int deleteByPrimaryKey(Integer hpId);

    int insert(Hospital record);

    int insertSelective(Hospital record);

    Hospital selectByPrimaryKey(Integer hpId);

    int updateByPrimaryKeySelective(Hospital record);

    int updateByPrimaryKey(Hospital record);

    List<Hospital> findHospital(Hospital hospitalList);
}