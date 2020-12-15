package com.hospital_purchase.service;

import com.hospital_purchase.pojo.Hospital;

import java.util.List;

public interface HospitalService {
    Hospital findOneHospital(Integer hpId);
    List findAllHospital();
}
