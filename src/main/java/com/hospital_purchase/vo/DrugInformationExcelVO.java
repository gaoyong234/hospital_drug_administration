package com.hospital_purchase.vo;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DrugInformationExcelVO extends BaseRowModel implements Serializable {

    @ExcelProperty(value = "流水号", index = 0)
    private String serialNumber;

    @ExcelProperty(value = "通用名", index = 1)
    private String commonName;

    @ExcelProperty(value = "剂型", index = 2)
    private String dosageForm;

    @ExcelProperty(value = "规格", index = 3)
    private String speciflcation;

    @ExcelProperty(value = "单位", index = 4)
    private String unitId;

    @ExcelProperty(value = "转换系数", index = 5)
    private Integer coefficient;

    @ExcelProperty(value = "生产企业", index = 6)
    private String productionName;

    @ExcelProperty(value = "商品名称", index = 7)
    private String commodityName;

    @ExcelProperty(value = "中标价格", index = 8)
    private BigDecimal biddingPrice;

    @ExcelProperty(value = "质量层次", index = 9)
    private String qualityLevel;

    @ExcelProperty(value = "批准文号", index = 10)
    private String approvalNumber;

    @ExcelProperty(value = "批准文号有效期", index = 11)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date approvalTime;

    @ExcelProperty(value = "是否进口", index = 12)
    private Byte isEntrance;

    @ExcelProperty(value = "包装材质", index = 13)
    private String packagingTexture;

    @ExcelProperty(value = "包装单位", index = 14)
    private Integer packUnit;

    @ExcelProperty(value = "最新零售价", index = 15)
    private BigDecimal newestPrice;

    @ExcelProperty(value = "零售价出处", index = 16)
    private String retailProvenance;

    @ExcelProperty(value = "有无药品检验报告", index = 17)
    private Byte isCheckout;

    @ExcelProperty(value = "药品检验报告编码", index = 18)
    private String heckoutNumber;

    @ExcelProperty(value = "药品检验报告有效期", index = 19)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date drugValidTime;

    @ExcelProperty(value = "产品说明", index = 20)
    private String productExplain;

    @ExcelProperty(value = "药品类别", index = 21)
    private String drugCategory;

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

    public String getQualityLevel() {
        return qualityLevel;
    }

    public void setQualityLevel(String qualityLevel) {
        this.qualityLevel = qualityLevel;
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

    public String getDrugCategory() {
        return drugCategory;
    }

    public void setDrugCategory(String drugCategory) {
        this.drugCategory = drugCategory;
    }
}
