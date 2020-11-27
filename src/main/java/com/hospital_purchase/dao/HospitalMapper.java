package com.hospital_purchase.dao;

import com.hospital_purchase.pojo.Hospital;

public interface HospitalMapper {
    int deleteByPrimaryKey(Integer hpId);

    int insert(Hospital record);

    int insertSelective(Hospital record);

    Hospital selectByPrimaryKey(Integer hpId);

    int updateByPrimaryKeySelective(Hospital record);

    int updateByPrimaryKey(Hospital record);
}