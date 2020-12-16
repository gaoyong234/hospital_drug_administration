package com.hospital_purchase.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hospital_purchase.dao.PurchaseDurgDao.PurchaseDrugDaoMapper;
import com.hospital_purchase.pojo.PurchaseDrug;
import com.hospital_purchase.service.PurchaseDrugService;
import com.hospital_purchase.util.ReturnUtil;
import com.hospital_purchase.vo.Message;
import com.hospital_purchase.vo.PurchaseDrugVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PurchaseDrugServiceImpl implements PurchaseDrugService {
    @Autowired
    private PurchaseDrugDaoMapper purchaseDrugDaoMapper;

    @Override
    public PageInfo<PurchaseDrugVO> findAllDrugByPurchase(Integer pageNum, Integer pageSize, PurchaseDrugVO purchaseDrugVO) {
        PageHelper.startPage(pageNum,pageSize);
        List list = purchaseDrugDaoMapper.selectAllDrugByPurchase(purchaseDrugVO);
        PageInfo<PurchaseDrugVO> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public Message addPurchaseDrug(PurchaseDrug purchaseDrug) {
        purchaseDrug.setCreateTime(new Date());
        Integer num = purchaseDrugDaoMapper.insertPurchaseDrug(purchaseDrug);
        Message message = ReturnUtil.returnDataOperation("添加", num);
        return message;
    }

    @Override
    public Message removeUpdatePurchaseDrug(Integer pdId) {
        Integer num = purchaseDrugDaoMapper.delUpdatePurchaseDrug(pdId);
        Message message = ReturnUtil.returnDataOperation("删除", num);
        return message;
    }

    @Override
    public Message changePurchaseDrug(PurchaseDrug purchaseDrug) {
        purchaseDrug.setModifiedTime(new Date());
        Integer num = purchaseDrugDaoMapper.updatePurchaseDrug(purchaseDrug);
        Message message = ReturnUtil.returnDataOperation("修改", num);
        return message;
    }

    @Override
    public PurchaseDrugVO findPurchaseDrug(Integer pdId) {
        PurchaseDrugVO purchaseDrugVO = purchaseDrugDaoMapper.selectPurchaseDrug(pdId);
        return purchaseDrugVO;
    }
}
