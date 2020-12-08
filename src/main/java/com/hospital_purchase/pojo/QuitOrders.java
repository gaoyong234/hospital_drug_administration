package com.hospital_purchase.pojo;

import java.util.Date;

public class QuitOrders {
    private Integer srId;

    private Integer hospitalId;

    private Date quitTime;

    private String quitNumber;

    private Integer quitState;

    private String quitName;

    private Date fundTime;

    private Date submitTime;

    private String linkman;

    private String linkmanPhone;

    private String remarks;

    private Integer delId;

    public Integer getSrId() {
        return srId;
    }

    public void setSrId(Integer srId) {
        this.srId = srId;
    }

    public Integer getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(Integer hospitalId) {
        this.hospitalId = hospitalId;
    }

    public Date getQuitTime() {
        return quitTime;
    }

    public void setQuitTime(Date quitTime) {
        this.quitTime = quitTime;
    }

    public String getQuitNumber() {
        return quitNumber;
    }

    public void setQuitNumber(String quitNumber) {
        this.quitNumber = quitNumber == null ? null : quitNumber.trim();
    }

    public Integer getQuitState() {
        return quitState;
    }

    public void setQuitState(Integer quitState) {
        this.quitState = quitState;
    }

    public String getQuitName() {
        return quitName;
    }

    public void setQuitName(String quitName) {
        this.quitName = quitName == null ? null : quitName.trim();
    }

    public Date getFundTime() {
        return fundTime;
    }

    public void setFundTime(Date fundTime) {
        this.fundTime = fundTime;
    }

    public Date getSubmitTime() {
        return submitTime;
    }

    public void setSubmitTime(Date submitTime) {
        this.submitTime = submitTime;
    }

    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman == null ? null : linkman.trim();
    }

    public String getLinkmanPhone() {
        return linkmanPhone;
    }

    public void setLinkmanPhone(String linkmanPhone) {
        this.linkmanPhone = linkmanPhone == null ? null : linkmanPhone.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public Integer getDelId() {
        return delId;
    }

    public void setDelId(Integer delId) {
        this.delId = delId;
    }
}