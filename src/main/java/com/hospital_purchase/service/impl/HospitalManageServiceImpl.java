package com.hospital_purchase.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hospital_purchase.dao.hospitalManageDao.HospitalManageMapper;
import com.hospital_purchase.pojo.Hospital;
import com.hospital_purchase.service.HospitalManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HospitalManageServiceImpl implements HospitalManageService {

    @Autowired
    private HospitalManageMapper hospitalManageMapper;

    @Override
    public PageInfo<Hospital> findHospital(Integer pageNum, Integer pageSize, Hospital hospitalList) {
        PageHelper.startPage(pageNum,pageSize);
        List<Hospital> list = hospitalManageMapper.findHospital(hospitalList);
        PageInfo<Hospital> hospitalPageInfo = new PageInfo<Hospital>(list);
        return hospitalPageInfo;
    }

    @Override
    public Integer addHospitaInfo(Hospital hospital) {
        return hospitalManageMapper.insertSelective(hospital);
    }

    @Override
    public Hospital queryHospitalInfoById(Integer hpId) {
        return hospitalManageMapper.selectByPrimaryKey(hpId);
    }

    @Override
    public Integer updateHospitalInfo(Hospital hospital) {
        return hospitalManageMapper.updateByPrimaryKeySelective(hospital);
    }
}
