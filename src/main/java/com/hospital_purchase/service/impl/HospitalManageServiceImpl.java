package com.hospital_purchase.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hospital_purchase.dao.drugInformation.DictionariesInfoMapper;
import com.hospital_purchase.dao.hospitalManageDao.HospitalManageMapper;
import com.hospital_purchase.pojo.Hospital;
import com.hospital_purchase.service.HospitalManageService;
import com.hospital_purchase.vo.HospitalVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HospitalManageServiceImpl implements HospitalManageService {

    @Autowired
    private HospitalManageMapper hospitalManageMapper;

    @Autowired
    private DictionariesInfoMapper dictionariesInfoMapper;

    @Override
    public PageInfo<HospitalVO> findHospital(Integer pageNum, Integer pageSize, HospitalVO hospitalList) {
        PageHelper.startPage(pageNum,pageSize);
        List<HospitalVO> list = hospitalManageMapper.findHospital(hospitalList);
        PageInfo<HospitalVO> hospitalPageInfo = new PageInfo<HospitalVO>(list);
        return hospitalPageInfo;
    }

    @Override
    public Integer addHospitaInfo(Hospital hospital) {
        return hospitalManageMapper.insertSelective(hospital);
    }

    @Override
    public HospitalVO queryHospitalInfoById(Integer hpId) {
        return hospitalManageMapper.selectByPrimaryKey(hpId);
    }

    @Override
    public Integer updateHospitalInfo(Hospital hospital) {
        return hospitalManageMapper.updateByPrimaryKeySelective(hospital);
    }

    @Override
    public List findDictionariesInfo() {
        return dictionariesInfoMapper.findDictionariesInfo();
    }

    @Override
    public Integer delHospitalInfo(int hpId) {
        return hospitalManageMapper.delHospitalInfo(hpId);
    }
}
