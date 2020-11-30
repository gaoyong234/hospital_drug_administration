package com.hospital_purchase.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class LimitFunctionVO {
    private Integer lfId;

    private String limitName;

    private String actionName;

    private String parentName;

    private Date creationTime;

    private Date modificationTime;
}
