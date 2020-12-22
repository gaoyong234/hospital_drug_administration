package com.hospital_purchase.service;

import com.github.pagehelper.PageInfo;
import com.hospital_purchase.pojo.PurchaseDrug;
import com.hospital_purchase.vo.Message;
import com.hospital_purchase.vo.PurchaseDrugVO;

import java.math.BigDecimal;
import java.util.List;


public interface PurchaseDrugService {
    //查采购单所有药品
    PageInfo<PurchaseDrugVO> findAllDrugByPurchase(Integer pageNum,Integer pageSize,PurchaseDrugVO purchaseDrugVO);
    //采购单添加药品
    Message addPurchaseDrug(Integer purchaseId, List<Integer> dmIdList);
    //采购单删除药品
    Message removeUpdatePurchaseDrug(List<Integer> pdId);
    //修改采购单-药品信息
    Message changePurchaseDrug(PurchaseDrug purchaseDrug);
    //查询单条数据
    PurchaseDrugVO findPurchaseDrug(Integer pdId);

    Message changeSupplier(Integer pdId, Integer drugId, Integer supId);

    //添加入库量、交易价格
    Message changePurchaseDrugDealPriceAndPurchaseQuantity(List<Integer> pdIds, List<BigDecimal> dealPrices,List<Integer> counts);



}
