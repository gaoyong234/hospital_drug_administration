package com.hospital_purchase.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class HospitalVO {
    private Integer hpId;

    private String hospitalNumber;

    private String hospitalName;

    private String mailingAddress;

    private Integer postalCode;

    private String affiliatingArea;

    private String hospitalRank;

    private Integer numberBed;

    private Integer isProfit;

    private Integer deanPhone;

    private String deanFax;

    private Integer medicamentPhone;

    private Integer hospitalType;

    private Float lastDrugMoney;

    private Float lastBusinessMoney;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date creationTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date modificationTime;

    private Integer delId;

    public Integer getHpId() {
        return hpId;
    }

    public void setHpId(Integer hpId) {
        this.hpId = hpId;
    }

    public String getHospitalNumber() {
        return hospitalNumber;
    }

    public void setHospitalNumber(String hospitalNumber) {
        this.hospitalNumber = hospitalNumber;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getMailingAddress() {
        return mailingAddress;
    }

    public void setMailingAddress(String mailingAddress) {
        this.mailingAddress = mailingAddress;
    }

    public Integer getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(Integer postalCode) {
        this.postalCode = postalCode;
    }

    public String getAffiliatingArea() {
        return affiliatingArea;
    }

    public void setAffiliatingArea(String affiliatingArea) {
        this.affiliatingArea = affiliatingArea;
    }

    public String getHospitalRank() {
        return hospitalRank;
    }

    public void setHospitalRank(String hospitalRank) {
        this.hospitalRank = hospitalRank;
    }

    public Integer getNumberBed() {
        return numberBed;
    }

    public void setNumberBed(Integer numberBed) {
        this.numberBed = numberBed;
    }

    public Integer getIsProfit() {
        return isProfit;
    }

    public void setIsProfit(Integer isProfit) {
        this.isProfit = isProfit;
    }

    public Integer getDeanPhone() {
        return deanPhone;
    }

    public void setDeanPhone(Integer deanPhone) {
        this.deanPhone = deanPhone;
    }

    public String getDeanFax() {
        return deanFax;
    }

    public void setDeanFax(String deanFax) {
        this.deanFax = deanFax;
    }

    public Integer getMedicamentPhone() {
        return medicamentPhone;
    }

    public void setMedicamentPhone(Integer medicamentPhone) {
        this.medicamentPhone = medicamentPhone;
    }

    public Integer getHospitalType() {
        return hospitalType;
    }

    public void setHospitalType(Integer hospitalType) {
        this.hospitalType = hospitalType;
    }

    public Float getLastDrugMoney() {
        return lastDrugMoney;
    }

    public void setLastDrugMoney(Float lastDrugMoney) {
        this.lastDrugMoney = lastDrugMoney;
    }

    public Float getLastBusinessMoney() {
        return lastBusinessMoney;
    }

    public void setLastBusinessMoney(Float lastBusinessMoney) {
        this.lastBusinessMoney = lastBusinessMoney;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public Date getModificationTime() {
        return modificationTime;
    }

    public void setModificationTime(Date modificationTime) {
        this.modificationTime = modificationTime;
    }

    public Integer getDelId() {
        return delId;
    }

    public void setDelId(Integer delId) {
        this.delId = delId;
    }
}