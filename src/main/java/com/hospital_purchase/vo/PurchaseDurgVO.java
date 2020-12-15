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
public class PurchaseDurgVO {

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

    //采购状态名称
    private String purchaseStateName;




}
