package com.hospital_purchase.service;

import com.github.pagehelper.PageInfo;
import com.hospital_purchase.pojo.PurchaseOrders;
import com.hospital_purchase.vo.Message;

public interface PurchaseOrdersService {

    PageInfo findAllPurchaseOrders(Integer pageNum, Integer pageSize, PurchaseOrders purchaseOrders);

    Message addPurchaseOrders(PurchaseOrders purchaseOrders);

    Integer changePurchaseOrders(PurchaseOrders purchaseOrders);

    Integer removePurchaseOrders(Integer id);


}
