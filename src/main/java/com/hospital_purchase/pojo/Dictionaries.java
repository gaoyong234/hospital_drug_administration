package com.hospital_purchase.pojo;

import java.util.Date;

public class Dictionaries {
    private Integer diId;

    private String dictionariesName;

    private Integer dictionariesId;

    private Date createTime;

    private Date modifiedTime;

    public Integer getDiId() {
        return diId;
    }

    public void setDiId(Integer diId) {
        this.diId = diId;
    }

    public String getDictionariesName() {
        return dictionariesName;
    }

    public void setDictionariesName(String dictionariesName) {
        this.dictionariesName = dictionariesName == null ? null : dictionariesName.trim();
    }

    public Integer getDictionariesId() {
        return dictionariesId;
    }

    public void setDictionariesId(Integer dictionariesId) {
        this.dictionariesId = dictionariesId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }
}