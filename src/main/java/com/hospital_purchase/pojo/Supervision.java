package com.hospital_purchase.pojo;

import java.util.Date;

public class Supervision {
    private Integer ssId;

    private String supervisionName;

    private String contactAddress;

    private String supervisionPostalCode;

    private String supervisionLinkman;

    private String supervisionPhone;

    private String supervisionFax;

    private String supervisionEmail;

    private String supervisionUrl;

    private Date gmtCreate;

    private Date gmtModified;

    public Integer getSsId() {
        return ssId;
    }

    public void setSsId(Integer ssId) {
        this.ssId = ssId;
    }

    public String getSupervisionName() {
        return supervisionName;
    }

    public void setSupervisionName(String supervisionName) {
        this.supervisionName = supervisionName == null ? null : supervisionName.trim();
    }

    public String getContactAddress() {
        return contactAddress;
    }

    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress == null ? null : contactAddress.trim();
    }

    public String getSupervisionPostalCode() {
        return supervisionPostalCode;
    }

    public void setSupervisionPostalCode(String supervisionPostalCode) {
        this.supervisionPostalCode = supervisionPostalCode == null ? null : supervisionPostalCode.trim();
    }

    public String getSupervisionLinkman() {
        return supervisionLinkman;
    }

    public void setSupervisionLinkman(String supervisionLinkman) {
        this.supervisionLinkman = supervisionLinkman == null ? null : supervisionLinkman.trim();
    }

    public String getSupervisionPhone() {
        return supervisionPhone;
    }

    public void setSupervisionPhone(String supervisionPhone) {
        this.supervisionPhone = supervisionPhone == null ? null : supervisionPhone.trim();
    }

    public String getSupervisionFax() {
        return supervisionFax;
    }

    public void setSupervisionFax(String supervisionFax) {
        this.supervisionFax = supervisionFax == null ? null : supervisionFax.trim();
    }

    public String getSupervisionEmail() {
        return supervisionEmail;
    }

    public void setSupervisionEmail(String supervisionEmail) {
        this.supervisionEmail = supervisionEmail == null ? null : supervisionEmail.trim();
    }

    public String getSupervisionUrl() {
        return supervisionUrl;
    }

    public void setSupervisionUrl(String supervisionUrl) {
        this.supervisionUrl = supervisionUrl == null ? null : supervisionUrl.trim();
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