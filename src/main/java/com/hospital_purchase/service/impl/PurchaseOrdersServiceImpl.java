package com.hospital_purchase.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hospital_purchase.dao.PurchaseOrderDao.PurchaseOrdersDaoMapper;
import com.hospital_purchase.dao.PurchaseOrdersMapper;
import com.hospital_purchase.pojo.PurchaseOrders;
import com.hospital_purchase.service.PurchaseOrdersService;
import com.hospital_purchase.vo.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        List<PurchaseOrders> purchaseOrdersList =
                purchaseOrdersDaoMapper.selectPurchaseOrdersList(purchaseOrders);
        PageInfo<PurchaseOrders> pageInfo = new PageInfo<PurchaseOrders>(purchaseOrdersList);

        return pageInfo;
    }

    @Override
    public Message addPurchaseOrders(PurchaseOrders purchaseOrders) {
        Message message = new Message();
        int num = purchaseOrdersMapper.insertSelective(purchaseOrders);
        if (num>0){
            message.setEstimate(true);
            message.setSlogan("添加成功！！");
        }else {
            message.setSlogan("添加失败！！");
            message.setEstimate(false);
        }
        return message;
    }

    @Override
    public Integer changePurchaseOrders(PurchaseOrders purchaseOrders) {
        return purchaseOrdersMapper.updateByPrimaryKeySelective(purchaseOrders);
    }

    @Override
    public Integer removePurchaseOrders(Integer id) {

        return purchaseOrdersMapper.deleteByPrimaryKey(id);
    }
}
