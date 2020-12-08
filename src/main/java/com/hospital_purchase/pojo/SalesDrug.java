package com.hospital_purchase.pojo;

import java.math.BigDecimal;

public class SalesDrug {
    private Integer drId;

    private Integer purchaseDrugId;

    private Integer drugNameId;

    private Integer salesReturnId;

    private Integer salesReturnQuantity;

    private BigDecimal salesReturnMoney;

    private String salesReturnCause;

    private Integer salesReturnState;

    private Integer delId;

    public Integer getDrId() {
        return drId;
    }

    public void setDrId(Integer drId) {
        this.drId = drId;
    }

    public Integer getPurchaseDrugId() {
        return purchaseDrugId;
    }

    public void setPurchaseDrugId(Integer purchaseDrugId) {
        this.purchaseDrugId = purchaseDrugId;
    }

    public Integer getDrugNameId() {
        return drugNameId;
    }

    public void setDrugNameId(Integer drugNameId) {
        this.drugNameId = drugNameId;
    }

    public Integer getSalesReturnId() {
        return salesReturnId;
    }

    public void setSalesReturnId(Integer salesReturnId) {
        this.salesReturnId = salesReturnId;
    }

    public Integer getSalesReturnQuantity() {
        return salesReturnQuantity;
    }

    public void setSalesReturnQuantity(Integer salesReturnQuantity) {
        this.salesReturnQuantity = salesReturnQuantity;
    }

    public BigDecimal getSalesReturnMoney() {
        return salesReturnMoney;
    }

    public void setSalesReturnMoney(BigDecimal salesReturnMoney) {
        this.salesReturnMoney = salesReturnMoney;
    }

    public String getSalesReturnCause() {
        return salesReturnCause;
    }

    public void setSalesReturnCause(String salesReturnCause) {
        this.salesReturnCause = salesReturnCause == null ? null : salesReturnCause.trim();
    }

    public Integer getSalesReturnState() {
        return salesReturnState;
    }

    public void setSalesReturnState(Integer salesReturnState) {
        this.salesReturnState = salesReturnState;
    }

    public Integer getDelId() {
        return delId;
    }

    public void setDelId(Integer delId) {
        this.delId = delId;
    }
}