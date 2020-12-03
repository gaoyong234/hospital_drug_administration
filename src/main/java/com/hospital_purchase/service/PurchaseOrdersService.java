package com.hospital_purchase.service;

import com.github.pagehelper.PageInfo;
import com.hospital_purchase.pojo.PurchaseOrders;

public interface PurchaseOrdersService {

    PageInfo findAllPurchaseOrders(Integer pageNum, Integer pageSize, PurchaseOrders purchaseOrders);

    Integer addPurchaseOrders(PurchaseOrders purchaseOrders);

    Integer changePurchaseOrders(PurchaseOrders purchaseOrders);

    Integer removePurchaseOrders(Integer id);


}
