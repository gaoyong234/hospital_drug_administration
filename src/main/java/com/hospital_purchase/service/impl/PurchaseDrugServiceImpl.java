package com.hospital_purchase.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hospital_purchase.dao.PurchaseDurgDao.PurchaseDrugDaoMapper;
import com.hospital_purchase.dao.drugInformation.DrugInformationMapper;
import com.hospital_purchase.pojo.PurchaseDrug;
import com.hospital_purchase.pojo.PurchaseOrders;
import com.hospital_purchase.service.PurchaseDrugService;
import com.hospital_purchase.util.ReturnUtil;
import com.hospital_purchase.vo.DrugMessageVO;
import com.hospital_purchase.vo.Message;
import com.hospital_purchase.vo.PurchaseDrugVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Service
public class PurchaseDrugServiceImpl implements PurchaseDrugService {
    @Autowired
    private PurchaseDrugDaoMapper purchaseDrugDaoMapper;
    @Autowired
    private DrugInformationMapper drugInformationMapper;

    @Override
    public PageInfo<PurchaseDrugVO> findAllDrugByPurchase(Integer pageNum, Integer pageSize, PurchaseDrugVO purchaseDrugVO) {
        PageHelper.startPage(pageNum,pageSize);
        List list = purchaseDrugDaoMapper.selectAllDrugByPurchase(purchaseDrugVO);
        PageInfo<PurchaseDrugVO> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public Message addPurchaseDrug(Integer purchaseId, List<Integer> dmIdList) {
        int count = 0;
        for (int i = 0; i < dmIdList.size(); i++) {
            PurchaseDrug purchaseDrug = new PurchaseDrug();
            DrugMessageVO drugMessageVO = drugInformationMapper.selectDrugById(dmIdList.get(i));
            purchaseDrug.setPurchaseId(purchaseId);
            purchaseDrug.setDrugId(dmIdList.get(i));
            purchaseDrug.setSupplierId(drugMessageVO.getSupplierId());
            purchaseDrug.setBidPrice(drugMessageVO.getBiddingPrice());
            purchaseDrug.setPurchaseState(62);
            purchaseDrug.setCreateTime(new Date());
            if(purchaseDrugDaoMapper.insertPurchaseDrug(purchaseDrug)>0){
                count++;
            }
        }
        Message message = ReturnUtil.returnDataOperation("添加", count);
        return message;
    }

    @Override
    public Message removeUpdatePurchaseDrug(List<Integer> pdId) {
        int count = 0;
        for (int i = 0; i < pdId.size(); i++) {
            Integer num = purchaseDrugDaoMapper.delUpdatePurchaseDrug(pdId.get(i));
            if (num>0){
                count++;
            }
        }

        Message message = ReturnUtil.returnDataOperation("删除", count);
        return message;
    }

    @Override
    public Message changePurchaseDrug(PurchaseDrug purchaseDrug) {
        purchaseDrug.setModifiedTime(new Date());
        Integer num = purchaseDrugDaoMapper.updatePurchaseDrug(purchaseDrug);
        Message message = ReturnUtil.returnDataOperation("修改", num);
        return message;
    }

    @Override
    public PurchaseDrugVO findPurchaseDrug(Integer pdId) {
        PurchaseDrugVO purchaseDrugVO = purchaseDrugDaoMapper.selectPurchaseDrug(pdId);
        return purchaseDrugVO;
    }

    @Override
    public Message changeSupplier(Integer pdId, Integer drugId, Integer supId) {
        Integer num = purchaseDrugDaoMapper.updateSupplier(pdId,drugId, supId);
        Message message = ReturnUtil.returnDataOperation("修改供货商", num);
        return message;
    }

    @Override
    public Message changePurchaseDrugDealPriceAndPurchaseQuantity(
            List<Integer> pdIds, List<BigDecimal> dealPrices, List<Integer> counts) {
        Integer count=0;
        PurchaseDrug purchaseDrug=new PurchaseDrug();
        for (int i = 0; i < pdIds.size(); i++) {
            purchaseDrug.setPdId(pdIds.get(i));
            purchaseDrug.setDealPrice(dealPrices.get(i));
            purchaseDrug.setPurchaseQuantity(counts.get(i));
            BigDecimal decimal = dealPrices.get(i).multiply(new BigDecimal(counts.get(i)));
            purchaseDrug.setPurchaseTotalAmount(decimal);
            Integer num = purchaseDrugDaoMapper.updatePurchaseDrugDealPriceAndPurchaseQuantity(purchaseDrug);
            if (num>0){
                count++;
            }
        }
        Message message = ReturnUtil.returnDataOperation("修改", count);
        return message;
    }


}
