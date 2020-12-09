package com.hospital_purchase.common;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.hospital_purchase.pojo.DrugMessage;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

public class DrugInformationDto {
    private Integer diId;

    private String serialNumber;

    private String commonName;

    private String dosageForm;

    private String speciflcation;

    private Integer unitId;

    private Integer coefficient;

    private String productionName;

    private String commodityName;

    private BigDecimal biddingPrice;

    private String approvalNumber;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date approvalTime;

    private Byte isEntrance;

    private String packagingTexture;

    private Integer packUnit;

    private BigDecimal newestPrice;

    private String retailProvenance;

    private String qualityLevel;

    private String qualityLevelExplain;

    private Byte isCheckout;

    private String heckoutNumber;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date drugValidTime;

    private String productExplain;

    private Integer drugCategory;

    private Integer drugState;

    public Integer getDiId() {
        return diId;
    }

    public void setDiId(Integer diId) {
        this.diId = diId;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getCommonName() {
        return commonName;
    }

    public void setCommonName(String commonName) {
        this.commonName = commonName;
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

    public Integer getUnitId() {
        return unitId;
    }

    public void setUnitId(Integer unitId) {
        this.unitId = unitId;
    }

    public Integer getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(Integer coefficient) {
        this.coefficient = coefficient;
    }

    public String getProductionName() {
        return productionName;
    }

    public void setProductionName(String productionName) {
        this.productionName = productionName;
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

    public String getApprovalNumber() {
        return approvalNumber;
    }

    public void setApprovalNumber(String approvalNumber) {
        this.approvalNumber = approvalNumber;
    }

    public Date getApprovalTime() {
        return approvalTime;
    }

    public void setApprovalTime(Date approvalTime) {
        this.approvalTime = approvalTime;
    }

    public Byte getIsEntrance() {
        return isEntrance;
    }

    public void setIsEntrance(Byte isEntrance) {
        this.isEntrance = isEntrance;
    }

    public String getPackagingTexture() {
        return packagingTexture;
    }

    public void setPackagingTexture(String packagingTexture) {
        this.packagingTexture = packagingTexture;
    }

    public Integer getPackUnit() {
        return packUnit;
    }

    public void setPackUnit(Integer packUnit) {
        this.packUnit = packUnit;
    }

    public BigDecimal getNewestPrice() {
        return newestPrice;
    }

    public void setNewestPrice(BigDecimal newestPrice) {
        this.newestPrice = newestPrice;
    }

    public String getRetailProvenance() {
        return retailProvenance;
    }

    public void setRetailProvenance(String retailProvenance) {
        this.retailProvenance = retailProvenance;
    }

    public String getQualityLevel() {
        return qualityLevel;
    }

    public void setQualityLevel(String qualityLevel) {
        this.qualityLevel = qualityLevel;
    }

    public String getQualityLevelExplain() {
        return qualityLevelExplain;
    }

    public void setQualityLevelExplain(String qualityLevelExplain) {
        this.qualityLevelExplain = qualityLevelExplain;
    }

    public Byte getIsCheckout() {
        return isCheckout;
    }

    public void setIsCheckout(Byte isCheckout) {
        this.isCheckout = isCheckout;
    }

    public String getHeckoutNumber() {
        return heckoutNumber;
    }

    public void setHeckoutNumber(String heckoutNumber) {
        this.heckoutNumber = heckoutNumber;
    }

    public Date getDrugValidTime() {
        return drugValidTime;
    }

    public void setDrugValidTime(Date drugValidTime) {
        this.drugValidTime = drugValidTime;
    }

    public String getProductExplain() {
        return productExplain;
    }

    public void setProductExplain(String productExplain) {
        this.productExplain = productExplain;
    }

    public Integer getDrugCategory() {
        return drugCategory;
    }

    public void setDrugCategory(Integer drugCategory) {
        this.drugCategory = drugCategory;
    }

    public Integer getDrugState() {
        return drugState;
    }

    public void setDrugState(Integer drugState) {
        this.drugState = drugState;
    }
}
