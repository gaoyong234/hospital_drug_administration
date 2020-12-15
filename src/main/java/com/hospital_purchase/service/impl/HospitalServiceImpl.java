package com.hospital_purchase.service.impl;

import com.hospital_purchase.dao.HospitalMapper;
import com.hospital_purchase.dao.hospitalManageDao.HospitalManageMapper;
import com.hospital_purchase.pojo.Hospital;
import com.hospital_purchase.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HospitalServiceImpl implements HospitalService {
    @Autowired
    private HospitalMapper hospitalMapper;
    @Autowired
    private HospitalManageMapper hospitalManageMapper;
    @Override
    public Hospital findOneHospital(Integer hpId) {
        return hospitalMapper.selectByPrimaryKey(hpId);
    }

    @Override
    public List findAllHospital() {
        return hospitalManageMapper.findHospital(null);
    }
}
