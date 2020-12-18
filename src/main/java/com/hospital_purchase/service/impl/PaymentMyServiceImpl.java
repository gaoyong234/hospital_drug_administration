package com.hospital_purchase.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hospital_purchase.dao.Payment.PaymentMyMapper;
import com.hospital_purchase.pojo.Payment;
import com.hospital_purchase.pojo.Supplier;
import com.hospital_purchase.service.PaymentMyService;
import com.hospital_purchase.vo.PaymentVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
@Resource
public class PaymentMyServiceImpl implements PaymentMyService {
    @Autowired
    PaymentMyMapper paymentMyMapper;

    @Override
    public List<Payment> findAllPayment(Payment payment) {
        return paymentMyMapper.findAllPayment(payment);
    }

    @Override
    public Integer addPayment(PaymentVo payment) {
        return paymentMyMapper.addPayment(payment);
    }

    @Override
    public PageInfo<PaymentVo> fandPayment(Integer pageNum, Integer pageSize, PaymentVo payment) {
        PageHelper.startPage(pageNum,pageSize);
        List<PaymentVo> registraPayment = paymentMyMapper.fandPayment(payment);
        PageInfo<PaymentVo> pageInfo = new PageInfo<PaymentVo>(registraPayment);
        return pageInfo;
    }
}
