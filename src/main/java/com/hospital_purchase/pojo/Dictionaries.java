package com.hospital_purchase.pojo;

import java.util.Date;

public class Dictionaries {
    private Integer dicId;

    private String dictionariesName;

    private Integer dictionariesId;

    private Date createTime;

    private Date modifiedTime;

    private Integer delId;

    public Integer getDicId() {
        return dicId;
    }

    public void setDicId(Integer dicId) {
        this.dicId = dicId;
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

    public Integer getDelId() {
        return delId;
    }

    public void setDelId(Integer delId) {
        this.delId = delId;
    }
}