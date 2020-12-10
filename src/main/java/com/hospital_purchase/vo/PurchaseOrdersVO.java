package com.hospital_purchase.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hospital_purchase.pojo.Hospital;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PurchaseOrdersVO {

    private Integer poId;

    private Integer hospitalId;

    private String purchaseNumber;

    private String purchaseName;

    private Integer auditState;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date submitTime;

    private String linkmanName;

    private String linkmanPhone;

    private String postscript;

    private Integer userId;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date auditTime;

    private String auditOpinion;

    private Integer purchaseState;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date modifiedTime;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date fundTime;

    private Integer delId;

    private String hospitalName;

    private String hospitalNumber;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date endTime;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date beginTime;

}
