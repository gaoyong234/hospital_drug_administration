package com.hospital_purchase.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class PayDrugVo {

    private Integer pdId;//结算单的中间表

    private Integer diId;//药品品目

    private String purchaseNumber;//采购单编码

    private String purchaseName;//采购单名称

    private String hospitalName;//采购医院

    private String serialNumber;//流水号

    private String commonName;//通用名

    private String commodityName;//商品名

    private BigDecimal biddingPrice;//中标价格

    private BigDecimal dealPrice;//交易价格

    //实际交易金额
    private String drugCategory;

    private Integer drugState;

    public Integer getDrugState() {
        return drugState;
    }

    public void setDrugState(Integer drugState) {
        this.drugState = drugState;
    }

    public String getDrugCategory() {
        return drugCategory;
    }

    public void setDrugCategory(String drugCategory) {
        this.drugCategory = drugCategory;
    }

    private Integer purchaseQuantity;//采购量

    private BigDecimal purchaseTotalAmount;//采购金额

    private Integer storageVolume;//入库量

    private String invoice;//发票号或入库单号

    private String drugBatchNumber;//药品批号

    private String effectiveTime;//药品有效期

    private String dosageForm;//剂型

    private String speciflcation;//规格

    private String unitId;//单位

    private Integer coefficient;//转换系数

    private String qualityLevel;//质量层次

    private String productionName;//生产企业

    private String supplierName;//供货企业

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date beginTime;//开始采购时间

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date endTime;//结束采购时间

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date storageqTime;//开始入库时间

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date storagejTime;//结束入库时间

    private String purchaseState;//采购状态

    private Integer salesReturnQuantity;//退货量

    private BigDecimal salesReturnMoney;//退货金额



 }
