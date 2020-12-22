package com.hospital_purchase.dao.ReturnOrder;

import com.github.pagehelper.PageInfo;
import com.hospital_purchase.vo.ReturnOrderVO;

import java.util.List;

public interface ReturnOrderMapper {
    //查询本医院已入库且未退货的药品信息
    List<ReturnOrderVO> findReturnOrderDrugInfo(ReturnOrderVO returnOrderVO);
}