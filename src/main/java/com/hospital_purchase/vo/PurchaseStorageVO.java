package com.hospital_purchase.vo;

import java.math.BigDecimal;
import java.util.Date;

public class PurchaseStorageVO {

    private Integer poId;
    private String purchaseNumber;//采购单编码
    private String purchaseName;//采购单名称
    private Integer serialNumber;//流水号
    private String commonName;//通用名
    private String commodityName;//商品名
    private BigDecimal biddingPrice;//中标价格
    private BigDecimal dealPrice;//交易价格
    private Integer purchaseQuantity;//采购量
    private BigDecimal purchaseTotalAmount;//采购金额
    private String dosageForm;//剂型
    private String speciflcation;//规格
    private String unitId;//单位
    private Integer coefficient;//转换系数
    private String purchaseState;//采购状态
    private Integer storageVolume;//入库量
    private String invoice;//发票或入库单号
    private String drugBatchNumber;//药品批号
    private Date effectiveTime;// 有效期
    private String productionName;//生产企业
    private String hospitalName;//采购医院
    private Date beginTime;//开始采购时间
    private Date endTime;//结束采购时间
    private String drugCategory;//药品类别
    private Date storageTime;//入库时间(头)
    private Date toStorageTime;//入库时间(尾)
    private String supplierName;//供货商


    public Integer getPoId() {
        return poId;
    }

    public void setPoId(Integer poId) {
        this.poId = poId;
    }

    public String getPurchaseNumber() {
        return purchaseNumber;
    }

    public void setPurchaseNumber(String purchaseNumber) {
        this.purchaseNumber = purchaseNumber;
    }

    public String getPurchaseName() {
        return purchaseName;
    }

    public void setPurchaseName(String purchaseName) {
        this.purchaseName = purchaseName;
    }

    public Integer getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getCommonName() {
        return commonName;
    }

    public void setCommonName(String commonName) {
        this.commonName = commonName;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public BigDecimal getBiddingPrice() {
        return biddingPrice;
    }

    public void setBiddingPrice(BigDecimal biddingPrice) {
        this.biddingPrice = biddingPrice;
    }

    public BigDecimal getDealPrice() {
        return dealPrice;
    }

    public void setDealPrice(BigDecimal dealPrice) {
        this.dealPrice = dealPrice;
    }

    public Integer getPurchaseQuantity() {
        return purchaseQuantity;
    }

    public void setPurchaseQuantity(Integer purchaseQuantity) {
        this.purchaseQuantity = purchaseQuantity;
    }

    public BigDecimal getPurchaseTotalAmount() {
        return purchaseTotalAmount;
    }

    public void setPurchaseTotalAmount(BigDecimal purchaseTotalAmount) {
        this.purchaseTotalAmount = purchaseTotalAmount;
    }

    public String getDosageForm() {
        return dosageForm;
    }

    public void setDosageForm(String dosageForm) {
        this.dosageForm = dosageForm;
    }

    public String getSpeciflcation() {
        return speciflcation;
    }

    public void setSpeciflcation(String speciflcation) {
        this.speciflcation = speciflcation;
    }

    public String getUnitId() {
        return unitId;
    }

    public void setUnitId(String unitId) {
        this.unitId = unitId;
    }

    public Integer getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(Integer coefficient) {
        this.coefficient = coefficient;
    }

    public String getPurchaseState() {
        return purchaseState;
    }

    public void setPurchaseState(String purchaseState) {
        this.purchaseState = purchaseState;
    }
}
