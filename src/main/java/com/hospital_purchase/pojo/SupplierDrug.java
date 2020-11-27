package com.hospital_purchase.pojo;

import java.util.Date;

public class SupplierDrug {
    private Integer sdId;

    private Integer supplierId;

    private Integer drugId;

    private Integer supplierDrugState;

    private String supplierDrugOpinion;

    private Date gmtCreate;

    private Date gmtModified;

    public Integer getSdId() {
        return sdId;
    }

    public void setSdId(Integer sdId) {
        this.sdId = sdId;
    }

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public Integer getDrugId() {
        return drugId;
    }

    public void setDrugId(Integer drugId) {
        this.drugId = drugId;
    }

    public Integer getSupplierDrugState() {
        return supplierDrugState;
    }

    public void setSupplierDrugState(Integer supplierDrugState) {
        this.supplierDrugState = supplierDrugState;
    }

    public String getSupplierDrugOpinion() {
        return supplierDrugOpinion;
    }

    public void setSupplierDrugOpinion(String supplierDrugOpinion) {
        this.supplierDrugOpinion = supplierDrugOpinion == null ? null : supplierDrugOpinion.trim();
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