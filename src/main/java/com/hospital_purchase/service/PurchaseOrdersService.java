package com.hospital_purchase.service;

import com.github.pagehelper.PageInfo;
import com.hospital_purchase.pojo.PurchaseOrders;
import com.hospital_purchase.vo.Message;
import com.hospital_purchase.vo.PurchaseOrdersVO;

public interface PurchaseOrdersService {

    PageInfo findAllPurchaseOrders(Integer pageNum, Integer pageSize, PurchaseOrders purchaseOrders);

    Message addPurchaseOrders(PurchaseOrders purchaseOrders);

    Message changePurchaseOrders(PurchaseOrders purchaseOrders);

    Message removePurchaseOrders(Integer id);

    PurchaseOrdersVO getPurchaseOrdersById(Integer id);


}
