package com.hospital_purchase.vo;

public class DrugInformationVO {
    private Integer diId;
    private String serialNumber;//流水号
    private String commonName;//通用名
    private String dosageForm;//剂型
    private String speciflcation;//规格
    private Integer coefficient;//转换系数
    private String productionName;//生产企业
    private String commodityName;//商品名称

    private Float biddingPriceStart;//中标价格开始
    private Float biddingPriceEnd;//中标价格结束
    private String company;//单位
    private String qualityLevel;//质量层次
    private String drugCategorys;//药品类别
    private String drugState;//药品交易状态

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

    public Float getBiddingPriceStart() {
        return biddingPriceStart;
    }

    public void setBiddingPriceStart(Float biddingPriceStart) {
        this.biddingPriceStart = biddingPriceStart;
    }

    public Float getBiddingPriceEnd() {
        return biddingPriceEnd;
    }

    public void setBiddingPriceEnd(Float biddingPriceEnd) {
        this.biddingPriceEnd = biddingPriceEnd;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getQualityLevel() {
        return qualityLevel;
    }

    public void setQualityLevel(String qualityLevel) {
        this.qualityLevel = qualityLevel;
    }

    public String getDrugCategorys() {
        return drugCategorys;
    }

    public void setDrugCategorys(String drugCategorys) {
        this.drugCategorys = drugCategorys;
    }

    public String getDrugState() {
        return drugState;
    }

    public void setDrugState(String drugState) {
        this.drugState = drugState;
    }
}
