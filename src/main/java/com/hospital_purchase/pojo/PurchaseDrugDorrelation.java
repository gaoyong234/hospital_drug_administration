package com.hospital_purchase.pojo;

import java.util.Date;

public class PurchaseDrugDorrelation {
    private Integer dcId;

    private Integer hospitalId;

    private Integer drugMessageId;

    private Integer drugSupplierId;

    private Date gmtCreate;

    private Date gmtModified;

    private Integer delId;

    public Integer getDcId() {
        return dcId;
    }

    public void setDcId(Integer dcId) {
        this.dcId = dcId;
    }

    public Integer getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(Integer hospitalId) {
        this.hospitalId = hospitalId;
    }

    public Integer getDrugMessageId() {
        return drugMessageId;
    }

    public void setDrugMessageId(Integer drugMessageId) {
        this.drugMessageId = drugMessageId;
    }

    public Integer getDrugSupplierId() {
        return drugSupplierId;
    }

    public void setDrugSupplierId(Integer drugSupplierId) {
        this.drugSupplierId = drugSupplierId;
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

    public Integer getDelId() {
        return delId;
    }

    public void setDelId(Integer delId) {
        this.delId = delId;
    }
}