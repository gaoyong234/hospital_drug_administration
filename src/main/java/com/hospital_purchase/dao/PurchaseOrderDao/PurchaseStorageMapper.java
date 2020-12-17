package com.hospital_purchase.dao.PurchaseOrderDao;

import com.github.pagehelper.PageInfo;
import com.hospital_purchase.vo.PurchaseStorageVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PurchaseStorageMapper {
    //查询采购入库单+分页+模糊查询
    List<PurchaseStorageVO> findPurchaseStorage(PurchaseStorageVO purchaseStorageVO);
    //按id查找采购数据
    List<PurchaseStorageVO> findPurchaseDataById(@Param("poId") List<Integer> poId);
}