package com.hospital_purchase.dao.PurchaseOrderDao;



import com.hospital_purchase.pojo.PurchaseOrders;
import com.hospital_purchase.vo.PurchaseOrdersVO;

import java.util.List;

public interface PurchaseOrdersDaoMapper {

    //查询多条
    List selectPurchaseOrdersList(PurchaseOrders purchaseOrders);
    //查询单个
    PurchaseOrdersVO selectPurchaseOrdersById(Integer poId);
    //加删除
    Integer updatePurchaseOrders(Integer poId);

}