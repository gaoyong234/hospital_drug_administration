package com.hospital_purchase.service.impl;

import com.hospital_purchase.dao.HospitalMapper;
import com.hospital_purchase.pojo.Hospital;
import com.hospital_purchase.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HospitalServiceImpl implements HospitalService {
    @Autowired
    private HospitalMapper hospitalMapper;
    @Override
    public Hospital findOneHospital(Integer hpId) {
        return hospitalMapper.selectByPrimaryKey(hpId);
    }
}
