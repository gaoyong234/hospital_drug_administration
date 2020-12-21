package com.hospital_purchase.common;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.xml.crypto.Data;
import java.util.Date;

public class PurchaseStorageDto {

    private Integer stId;
    private Integer poId;
    private Integer storageVolume;
    private String invoice;
    private String drugBatchNumber;
    private String purchaseState;
    private String effectiveTime;// 有效期

    public Integer getStId() {
        return stId;
    }

    public void setStId(Integer stId) {
        this.stId = stId;
    }

    public Integer getPoId() {
        return poId;
    }

    public void setPoId(Integer poId) {
        this.poId = poId;
    }

    public Integer getStorageVolume() {
        return storageVolume;
    }

    public void setStorageVolume(Integer storageVolume) {
        this.storageVolume = storageVolume;
    }

    public String getInvoice() {
        return invoice;
    }

    public void setInvoice(String invoice) {
        this.invoice = invoice;
    }

    public String getDrugBatchNumber() {
        return drugBatchNumber;
    }

    public void setDrugBatchNumber(String drugBatchNumber) {
        this.drugBatchNumber = drugBatchNumber;
    }

    public String getPurchaseState() {
        return purchaseState;
    }

    public void setPurchaseState(String purchaseState) {
        this.purchaseState = purchaseState;
    }

    public String getEffectiveTime() {
        return effectiveTime;
    }

    public void setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
    }
}
