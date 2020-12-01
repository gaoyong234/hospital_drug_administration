package com.hospital_purchase.pojo;

import java.util.Date;

public class LimitFunction {
    private Integer lfId;

    private String limitName;

    private String actionName;

    private Integer parentId;

    private Date creationTime;

    private Date modificationTime;

    public Integer getLfId() {
        return lfId;
    }

    public void setLfId(Integer lfId) {
        this.lfId = lfId;
    }

    public String getLimitName() {
        return limitName;
    }

    public void setLimitName(String limitName) {
        this.limitName = limitName == null ? null : limitName.trim();
    }

    public String getActionName() {
        return actionName;
    }

    public void setActionName(String actionName) {
        this.actionName = actionName == null ? null : actionName.trim();
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
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
}