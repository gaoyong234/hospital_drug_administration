package com.hospital_purchase.pojo;

import java.util.Date;

public class Payment {
    private Integer soId;

    private Integer drugId;

    private String paymentNumber;

    private String paymentName;

    private Date paymentTime;

    private Date establishTime;

    private String paymentLinkman;

    private String paymentPhone;

    private Integer paymentState;

    private Date presentTime;

    private String presentRemarks;

    private Date gmtCreate;

    private Date gmtModified;

    public Integer getSoId() {
        return soId;
    }

    public void setSoId(Integer soId) {
        this.soId = soId;
    }

    public Integer getDrugId() {
        return drugId;
    }

    public void setDrugId(Integer drugId) {
        this.drugId = drugId;
    }

    public String getPaymentNumber() {
        return paymentNumber;
    }

    public void setPaymentNumber(String paymentNumber) {
        this.paymentNumber = paymentNumber == null ? null : paymentNumber.trim();
    }

    public String getPaymentName() {
        return paymentName;
    }

    public void setPaymentName(String paymentName) {
        this.paymentName = paymentName == null ? null : paymentName.trim();
    }

    public Date getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }

    public Date getEstablishTime() {
        return establishTime;
    }

    public void setEstablishTime(Date establishTime) {
        this.establishTime = establishTime;
    }

    public String getPaymentLinkman() {
        return paymentLinkman;
    }

    public void setPaymentLinkman(String paymentLinkman) {
        this.paymentLinkman = paymentLinkman == null ? null : paymentLinkman.trim();
    }

    public String getPaymentPhone() {
        return paymentPhone;
    }

    public void setPaymentPhone(String paymentPhone) {
        this.paymentPhone = paymentPhone == null ? null : paymentPhone.trim();
    }

    public Integer getPaymentState() {
        return paymentState;
    }

    public void setPaymentState(Integer paymentState) {
        this.paymentState = paymentState;
    }

    public Date getPresentTime() {
        return presentTime;
    }

    public void setPresentTime(Date presentTime) {
        this.presentTime = presentTime;
    }

    public String getPresentRemarks() {
        return presentRemarks;
    }

    public void setPresentRemarks(String presentRemarks) {
        this.presentRemarks = presentRemarks == null ? null : presentRemarks.trim();
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }
}