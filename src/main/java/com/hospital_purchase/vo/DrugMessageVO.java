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
public class DrugMessageVO {
    private Integer dmId;//药品信息id

    private Integer drugItemsId;//品目id

    private String companyName;

    private String commodityName;//商品名称

    private BigDecimal biddingPrice;

    private String qualityLevel;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date foundTime;

    private String approvalNumber;

    private Byte isEntrance;

    private Integer packUnit;

    private String retailProvenance;

    private String heckoutNumber;

    private String productExplain;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date approvalTime;

    private String packagingTexture;

    private BigDecimal newestPrice;

    private Byte isCheckout;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date drugValidTime;

    private String qualityLevelExplain;

    private String productPhoto;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date modifiedTime;

    private Integer delId;

    private String serialNumber;//流水号
    private String commonName;//通用名
    private String dosageForm;//剂型
    private String speciflcation;//规格
    private Integer unitId;//单位id
    private String company;//单位
    private Integer coefficient;//转换系数
    private String productionName;//生产企业
    private Integer drugCategory;//药品类别id
    private String drugCategoryName;//药品类别
    private Integer drugState;//药品交易状态
    private String drugStateName;//交易名称
    private Integer supplierId;//供货商id
    private String supplierName;//供货商名称
    private BigDecimal biddingPriceBegin;//中标起始
    private BigDecimal biddingPriceEnd;//中标结束


}
