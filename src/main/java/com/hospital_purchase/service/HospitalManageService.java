package com.hospital_purchase.service;

import com.github.pagehelper.PageInfo;
import com.hospital_purchase.pojo.Hospital;

public interface HospitalManageService {
    //查询+模糊查询+分页
    PageInfo<Hospital> findHospital(Integer pageNum, Integer pageSize, Hospital hospitalList);
    //添加医院信息
    Integer addHospitaInfo(Hospital hospital);
    //根据主键id查询医院信息
    Hospital queryHospitalInfoById(Integer hpId);
    //根据id修改医院信息
    Integer updateHospitalInfo(Hospital hospital);
}
