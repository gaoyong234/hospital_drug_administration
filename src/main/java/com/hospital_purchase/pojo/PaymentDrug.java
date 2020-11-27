package com.hospital_purchase.pojo;

import java.util.Date;

public class PaymentDrug {
    private Integer pdId;

    private Integer purchaseId;

    private Integer drugId;

    private Integer settiementOrdersId;

    private Integer paymentQuantity;

    private Float paymentMoney;

    private Integer paymentState;

    private Date gmtCreate;

    private Date gmtModified;

    public Integer getPdId() {
        return pdId;
    }

    public void setPdId(Integer pdId) {
        this.pdId = pdId;
    }

    public Integer getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(Integer purchaseId) {
        this.purchaseId = purchaseId;
    }

    public Integer getDrugId() {
        return drugId;
    }

    public void setDrugId(Integer drugId) {
        this.drugId = drugId;
    }

    public Integer getSettiementOrdersId() {
        return settiementOrdersId;
    }

    public void setSettiementOrdersId(Integer settiementOrdersId) {
        this.settiementOrdersId = settiementOrdersId;
    }

    public Integer getPaymentQuantity() {
        return paymentQuantity;
    }

    public void setPaymentQuantity(Integer paymentQuantity) {
        this.paymentQuantity = paymentQuantity;
    }

    public Float getPaymentMoney() {
        return paymentMoney;
    }

    public void setPaymentMoney(Float paymentMoney) {
        this.paymentMoney = paymentMoney;
    }

    public Integer getPaymentState() {
        return paymentState;
    }

    public void setPaymentState(Integer paymentState) {
        this.paymentState = paymentState;
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