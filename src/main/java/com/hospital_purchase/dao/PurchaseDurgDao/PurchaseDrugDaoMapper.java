package com.hospital_purchase.dao.PurchaseDurgDao;

import com.hospital_purchase.pojo.PurchaseDrug;
import com.hospital_purchase.vo.PurchaseDrugVO;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;

public interface PurchaseDrugDaoMapper {
    //查采购单所有药品
    List selectAllDrugByPurchase(PurchaseDrugVO purchaseDrugVO);
    //采购单添加药品
    Integer insertPurchaseDrug(PurchaseDrug purchaseDrug);
    //采购单删除药品
    Integer delUpdatePurchaseDrug(Integer pdId);
    //修改采购单-药品信息
    Integer updatePurchaseDrug(PurchaseDrug purchaseDrug);
    //查询单条数据
    PurchaseDrugVO selectPurchaseDrug(Integer pdId);
    //修改供货商
    Integer updateSupplier(@Param(value = "pdId") Integer pdId,@Param(value = "drugId") Integer drugId ,@Param(value = "supId") Integer supId);
    //添加入库量、交易价格
    Integer updatePurchaseDrugDealPriceAndPurchaseQuantity(PurchaseDrug purchaseDrug);



}
