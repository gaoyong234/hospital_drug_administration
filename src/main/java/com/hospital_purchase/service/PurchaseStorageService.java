package com.hospital_purchase.service;

import com.github.pagehelper.PageInfo;
import com.hospital_purchase.vo.PurchaseStorageVO;

public interface PurchaseStorageService {
    PageInfo<PurchaseStorageVO> findPurchaseStorage(Integer pageNum, Integer pageSize, PurchaseStorageVO purchaseStorageVO);
}
