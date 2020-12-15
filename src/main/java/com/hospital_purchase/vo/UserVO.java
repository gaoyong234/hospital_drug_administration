package com.hospital_purchase.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

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

    private String userPhone;

    private String userEmail;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date creationTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date modificationTime;

    private Integer delId;

    private String hospitalName;

    private String categoryName;

    private String stateName;

}
