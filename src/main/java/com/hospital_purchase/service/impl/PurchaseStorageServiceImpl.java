package com.hospital_purchase.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hospital_purchase.dao.PurchaseOrderDao.PurchaseStorageMapper;
import com.hospital_purchase.service.PurchaseStorageService;
import com.hospital_purchase.vo.PurchaseStorageVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PurchaseStorageServiceImpl implements PurchaseStorageService {

    @Autowired
    private PurchaseStorageMapper purchaseStorageMapper;

    @Override
    public PageInfo<PurchaseStorageVO> findPurchaseStorage(Integer pageNum, Integer pageSize, PurchaseStorageVO purchaseStorageVO) {
        PageHelper.startPage(pageNum,pageSize);
        List<PurchaseStorageVO> list = purchaseStorageMapper.findPurchaseStorage(purchaseStorageVO);
        PageInfo<PurchaseStorageVO> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }
}
