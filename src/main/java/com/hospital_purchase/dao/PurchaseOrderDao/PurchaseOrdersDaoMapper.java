package com.hospital_purchase.dao.PurchaseOrderDao;

import com.hospital_purchase.pojo.PurchaseOrders;

import java.util.List;

public interface PurchaseOrdersDaoMapper {

    List selectPurchaseOrdersList(PurchaseOrders purchaseOrders);


}