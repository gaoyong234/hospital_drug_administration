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
public class PurchaseDrugVO {

    private Integer pdId;

    //采购单id
    private Integer purchaseId;

    //药品id
    private Integer drugId;

    //供货商id
    private Integer supplierId;

    //中标价  药品中有
    private BigDecimal bidPrice;

    //交易价
    private BigDecimal dealPrice;

    //采购量
    private Integer purchaseQuantity;

    //采购总额
    private BigDecimal purchaseTotalAmount;

    //采购状态id
    private Integer purchaseState;

    //创建时间
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date createTime;

    //修改时间
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date modifiedTime;

    private Integer delId;


    private String purchaseStateName;//采购状态名称
    private String serialNumber;//流水号
    private String commonName;//通用名
    private String dosageForm;//剂型
    private String speciflcation;//规格
    private Integer coefficient;//转换系数
    private Integer unitId;//单位id
    private String company;//单位
    private String productionName;//生产企业
    private String commodityName;//商品名称
    private String qualityLevel;//质量层次
    private Integer drugCategory;//药品类别id
    private String drugCategorys;//药品类别
    private String  supplierName;//供货商名称



}
