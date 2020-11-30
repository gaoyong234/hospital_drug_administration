package com.hospital_purchase.pojo;

import java.util.Date;

public class DrugItems {
    private Integer diId;

    private String commonName;

    private String dosageForm;

    private String speciflcation;

    private Integer unitId;

    private Integer coefficient;

    private Date createTime;

    private Date modifiedTime;

    private String productionName;

    private String commodityName;

    private String serialNumber;

    private Integer drugCategory;

    private Integer drugState;

    private DrugMessage biddingPrice;

    private Dictionaries company;
    private Dictionaries qualityLevel;
    private Dictionaries drugCategorys;

    public Dictionaries getCompany() {
        return company;
    }

    public void setCompany(Dictionaries company) {
        this.company = company;
    }

    public Dictionaries getQualityLevel() {
        return qualityLevel;
    }

    public void setQualityLevel(Dictionaries qualityLevel) {
        this.qualityLevel = qualityLevel;
    }

    public Dictionaries getDrugCategorys() {
        return drugCategorys;
    }

    public void setDrugCategorys(Dictionaries drugCategorys) {
        this.drugCategorys = drugCategorys;
    }

    public DrugMessage getBiddingPrice() {
        return biddingPrice;
    }

    public void setBiddingPrice(DrugMessage biddingPrice) {
        this.biddingPrice = biddingPrice;
    }

    public Integer getDiId() {
        return diId;
    }

    public void setDiId(Integer diId) {
        this.diId = diId;
    }

    public String getCommonName() {
        return commonName;
    }

    public void setCommonName(String commonName) {
        this.commonName = commonName == null ? null : commonName.trim();
    }

    public String getDosageForm() {
        return dosageForm;
    }

    public void setDosageForm(String dosageForm) {
        this.dosageForm = dosageForm == null ? null : dosageForm.trim();
    }

    public String getSpeciflcation() {
        return speciflcation;
    }

    public void setSpeciflcation(String speciflcation) {
        this.speciflcation = speciflcation == null ? null : speciflcation.trim();
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public String getProductionName() {
        return productionName;
    }

    public void setProductionName(String productionName) {
        this.productionName = productionName == null ? null : productionName.trim();
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName == null ? null : commodityName.trim();
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber == null ? null : serialNumber.trim();
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