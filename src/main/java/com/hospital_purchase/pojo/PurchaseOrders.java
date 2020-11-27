package com.hospital_purchase.pojo;

import java.util.Date;

public class PurchaseOrders {
    private Integer poId;

    private Integer auditState;

    private String auditOpinion;

    private Integer hospitalId;

    private String purchaseName;

    private Date fundTime;

    private Integer purchaseState;

    private Date modifiedTime;

    private Date submitTime;

    private String linkmanName;

    private String linkmanPhone;

    private Integer userId;

    private Date auditTime;

    private String purchaseNumber;

    public Integer getPoId() {
        return poId;
    }

    public void setPoId(Integer poId) {
        this.poId = poId;
    }

    public Integer getAuditState() {
        return auditState;
    }

    public void setAuditState(Integer auditState) {
        this.auditState = auditState;
    }

    public Integer getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(Integer hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getPurchaseName() {
        return purchaseName;
    }

    public void setPurchaseName(String purchaseName) {
        this.purchaseName = purchaseName == null ? null : purchaseName.trim();
    }

    public Date getFundTime() {
        return fundTime;
    }

    public void setFundTime(Date fundTime) {
        this.fundTime = fundTime;
    }

    public Integer getPurchaseState() {
        return purchaseState;
    }

    public void setPurchaseState(Integer purchaseState) {
        this.purchaseState = purchaseState;
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public Date getSubmitTime() {
        return submitTime;
    }

    public void setSubmitTime(Date submitTime) {
        this.submitTime = submitTime;
    }

    public String getLinkmanName() {
        return linkmanName;
    }

    public void setLinkmanName(String linkmanName) {
        this.linkmanName = linkmanName == null ? null : linkmanName.trim();
    }

    public String getLinkmanPhone() {
        return linkmanPhone;
    }

    public void setLinkmanPhone(String linkmanPhone) {
        this.linkmanPhone = linkmanPhone == null ? null : linkmanPhone.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getAuditOpinion() {
        return auditOpinion;
    }

    public void setAuditOpinion(String auditOpinion) {
        this.auditOpinion = auditOpinion == null ? null : auditOpinion.trim();
    }

    public Date getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

    public String getPurchaseNumber() {
        return purchaseNumber;
    }

    public void setPurchaseNumber(String purchaseNumber) {
        this.purchaseNumber = purchaseNumber == null ? null : purchaseNumber.trim();
    }
}