package com.hospital_purchase.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hospital_purchase.dao.PurchaseOrderDao.PurchaseOrdersDaoMapper;
import com.hospital_purchase.dao.PurchaseOrdersMapper;
import com.hospital_purchase.pojo.PurchaseOrders;
import com.hospital_purchase.service.PurchaseOrdersService;
import com.hospital_purchase.util.Identities;
import com.hospital_purchase.util.ReturnUtil;
import com.hospital_purchase.vo.Message;
import com.hospital_purchase.vo.PurchaseOrdersVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class PurchaseOrdersServiceImpl implements PurchaseOrdersService {
    @Autowired
    private PurchaseOrdersMapper purchaseOrdersMapper;
    @Autowired
    private PurchaseOrdersDaoMapper purchaseOrdersDaoMapper;

    @Override
    public PageInfo findAllPurchaseOrders(Integer pageNum, Integer pageSize, PurchaseOrders purchaseOrders) {
        PageHelper.startPage(pageNum,pageSize);
        List<PurchaseOrdersVO> purchaseOrdersList = purchaseOrdersDaoMapper.selectPurchaseOrdersList(purchaseOrders);
        PageInfo<PurchaseOrdersVO> pageInfo = new PageInfo<PurchaseOrdersVO>(purchaseOrdersList);
        return pageInfo;
    }

    @Override
    public Message addPurchaseOrders(PurchaseOrders purchaseOrders) {
        Date date = new Date();
        purchaseOrders.setFundTime(date);
        purchaseOrders.setSubmitTime(date);
        purchaseOrders.setPurchaseNumber(Identities.randomLong("采购单"));
        int num = purchaseOrdersMapper.insertSelective(purchaseOrders);
        Message message = ReturnUtil.returnDataOperation("添加", num);
        return message;
    }

    @Override
    public Message changePurchaseOrders(PurchaseOrders purchaseOrders) {
        purchaseOrders.setModifiedTime(new Date());
        Integer num = purchaseOrdersMapper.updateByPrimaryKeySelective(purchaseOrders);
        Message message = ReturnUtil.returnDataOperation("修改", num);
        return message;
    }

    @Override
    public Message removePurchaseOrders(Integer id) {
        Integer num = purchaseOrdersDaoMapper.updatePurchaseOrders(id);
        Message message = ReturnUtil.returnDataOperation("删除", num);
        return message;
    }

    @Override
    public PurchaseOrdersVO getPurchaseOrdersById(Integer id) {
        return purchaseOrdersDaoMapper.selectPurchaseOrdersById(id);
    }
}
