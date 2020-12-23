package com.hospital_purchase.dao.PurchaseOrderDao;



import com.hospital_purchase.vo.PurchaseOrdersVO;

import java.util.List;

public interface PurchaseOrdersDaoMapper {

    //查询多条
    List selectPurchaseOrdersList(PurchaseOrdersVO purchaseOrdersVO);
    //查询单个
    PurchaseOrdersVO selectPurchaseOrdersById(Integer poId);
    //加删除
    Integer updatePurchaseOrders(Integer poId);
    //修改采购单状态
    Integer updatePurchaseDrugState(Integer poId);

}