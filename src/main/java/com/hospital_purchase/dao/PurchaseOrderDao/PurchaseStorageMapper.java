package com.hospital_purchase.dao.PurchaseOrderDao;

import com.github.pagehelper.PageInfo;
import com.hospital_purchase.vo.PurchaseStorageVO;

import java.util.List;

public interface PurchaseStorageMapper {

    List<PurchaseStorageVO> findPurchaseStorage(PurchaseStorageVO purchaseStorageVO);
}