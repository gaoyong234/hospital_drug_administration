package com.hospital_purchase.service;

import com.github.pagehelper.PageInfo;
import com.hospital_purchase.pojo.Dictionaries;
import com.hospital_purchase.pojo.Hospital;
import com.hospital_purchase.vo.HospitalVO;

import java.util.List;

public interface HospitalManageService {
    //查询+模糊查询+分页
    PageInfo<HospitalVO> findHospital(Integer pageNum, Integer pageSize, HospitalVO hospitalList);
    //添加医院信息
    Integer addHospitaInfo(Hospital hospital);
    //根据主键id查询医院信息
    HospitalVO queryHospitalInfoById(Integer hpId);
    //根据id修改医院信息
    Integer updateHospitalInfo(Hospital hospital);
    //查询字典表里的医院级别信息
    List findDictionariesInfo();
    //删除医院信息
    Integer delHospitalInfo(int hpId);
}
