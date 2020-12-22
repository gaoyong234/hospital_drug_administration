package com.hospital_purchase.service;

import com.github.pagehelper.PageInfo;
import com.hospital_purchase.pojo.QuitOrders;
import com.hospital_purchase.vo.ReturnOrderVO;

import java.util.List;

public interface ReturnOrderService {
    //查询本医院已入库且未退货的药品信息
    PageInfo<ReturnOrderVO> findReturnOrderDrugInfo(Integer pageNum, Integer pageSize, ReturnOrderVO returnOrderVO);
    //
    Integer addReturnOrder(QuitOrders quitOrders);
}
