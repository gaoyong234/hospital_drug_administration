package com.hospital_purchase.service;

import com.github.pagehelper.PageInfo;
import com.hospital_purchase.pojo.Storage;
import com.hospital_purchase.vo.PurchaseStorageVO;

import java.util.List;

public interface PurchaseStorageService {
    //查询采购入库单+分页+模糊查询
    PageInfo<PurchaseStorageVO> findPurchaseStorage(Integer pageNum, Integer pageSize, PurchaseStorageVO purchaseStorageVO);
    //按id查找采购数据
    List<PurchaseStorageVO> findPurchaseDataById(List<Integer> poId);

    Integer stockInPurchaseInfo(List<Storage> list);
}
