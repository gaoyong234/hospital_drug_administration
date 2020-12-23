package com.hospital_purchase.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hospital_purchase.dao.PaymentDrugDao.PaymentDrugMyMapper;
import com.hospital_purchase.service.PaymentDrugService;
import com.hospital_purchase.vo.PayDrugVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
@Resource
public class PaymentDrugServiceImpl implements PaymentDrugService {
    @Autowired
    PaymentDrugMyMapper paymentDrugMyMapper;

    @Override
    public PageInfo<PayDrugVo> fandAll(Integer pageNum, Integer pageSize, PayDrugVo payDrugVo) {
        PageHelper.startPage(pageNum,pageSize);
        List<PayDrugVo> registraPayment = paymentDrugMyMapper.findAll(payDrugVo);
        PageInfo<PayDrugVo> pageInfo = new PageInfo<PayDrugVo>(registraPayment);
        return pageInfo;
    }
}
