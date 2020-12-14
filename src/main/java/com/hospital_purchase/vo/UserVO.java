package com.hospital_purchase.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserVO {
    private Integer usId;

    private Integer userAccount;

    private String userName;

    private Integer userCategory;

    private String userPassword;

    private Integer userState;

    private Integer hospitalId;

    private String contactAddress;

    private Integer userPostalCode;

    private String userLinkman;

    private Integer userPhone;

    private String userEmail;

    private Date creationTime;

    private Date modificationTime;

    private Integer delId;

    private String hospitalName;

    private String categoryName;

    private String stateName;

}
