package com.hospital_purchase.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

public class DrugMessage {
    private Integer dmId;

    private Integer drugItemsId;

    private String companyName;

    private String commodityName;

    private BigDecimal biddingPrice;

    private String qualityLevel;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date foundTime;

    private String approvalNumber;

    private Byte isEntrance;

    private Integer packUnit;

    private String retailProvenance;

    private String heckoutNumber;

    private String productExplain;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date approvalTime;

    private String packagingTexture;

    private BigDecimal newestPrice;

    private Byte isCheckout;

    private Date drugValidTime;

    private String qualityLevelExplain;

    private String productPhoto;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date modifiedTime;

    private Integer delId;

    public Integer getDmId() {
        return dmId;
    }

    public void setDmId(Integer dmId) {
        this.dmId = dmId;
    }

    public Integer getDrugItemsId() {
        return drugItemsId;
    }

    public void setDrugItemsId(Integer drugItemsId) {
        this.drugItemsId = drugItemsId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName == null ? null : commodityName.trim();
    }

    public BigDecimal getBiddingPrice() {
        return biddingPrice;
    }

    public void setBiddingPrice(BigDecimal biddingPrice) {
        this.biddingPrice = biddingPrice;
    }

    public String getQualityLevel() {
        return qualityLevel;
    }

    public void setQualityLevel(String qualityLevel) {
        this.qualityLevel = qualityLevel == null ? null : qualityLevel.trim();
    }

    public Date getFoundTime() {
        return foundTime;
    }

    public void setFoundTime(Date foundTime) {
        this.foundTime = foundTime;
    }

    public String getApprovalNumber() {
        return approvalNumber;
    }

    public void setApprovalNumber(String approvalNumber) {
        this.approvalNumber = approvalNumber == null ? null : approvalNumber.trim();
    }

    public Byte getIsEntrance() {
        return isEntrance;
    }

    public void setIsEntrance(Byte isEntrance) {
        this.isEntrance = isEntrance;
    }

    public Integer getPackUnit() {
        return packUnit;
    }

    public void setPackUnit(Integer packUnit) {
        this.packUnit = packUnit;
    }

    public String getRetailProvenance() {
        return retailProvenance;
    }

    public void setRetailProvenance(String retailProvenance) {
        this.retailProvenance = retailProvenance == null ? null : retailProvenance.trim();
    }

    public String getHeckoutNumber() {
        return heckoutNumber;
    }

    public void setHeckoutNumber(String heckoutNumber) {
        this.heckoutNumber = heckoutNumber == null ? null : heckoutNumber.trim();
    }

    public String getProductExplain() {
        return productExplain;
    }

    public void setProductExplain(String productExplain) {
        this.productExplain = productExplain == null ? null : productExplain.trim();
    }

    public Date getApprovalTime() {
        return approvalTime;
    }

    public void setApprovalTime(Date approvalTime) {
        this.approvalTime = approvalTime;
    }

    public String getPackagingTexture() {
        return packagingTexture;
    }

    public void setPackagingTexture(String packagingTexture) {
        this.packagingTexture = packagingTexture == null ? null : packagingTexture.trim();
    }

    public BigDecimal getNewestPrice() {
        return newestPrice;
    }

    public void setNewestPrice(BigDecimal newestPrice) {
        this.newestPrice = newestPrice;
    }

    public Byte getIsCheckout() {
        return isCheckout;
    }

    public void setIsCheckout(Byte isCheckout) {
        this.isCheckout = isCheckout;
    }

    public Date getDrugValidTime() {
        return drugValidTime;
    }

    public void setDrugValidTime(Date drugValidTime) {
        this.drugValidTime = drugValidTime;
    }

    public String getQualityLevelExplain() {
        return qualityLevelExplain;
    }

    public void setQualityLevelExplain(String qualityLevelExplain) {
        this.qualityLevelExplain = qualityLevelExplain == null ? null : qualityLevelExplain.trim();
    }

    public String getProductPhoto() {
        return productPhoto;
    }

    public void setProductPhoto(String productPhoto) {
        this.productPhoto = productPhoto == null ? null : productPhoto.trim();
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public Integer getDelId() {
        return delId;
    }

    public void setDelId(Integer delId) {
        this.delId = delId;
    }
}