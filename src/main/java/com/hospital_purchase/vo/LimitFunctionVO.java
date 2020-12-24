package com.hospital_purchase.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hospital_purchase.pojo.LimitFunction;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class LimitFunctionVO {
    private Integer lfId;

    private String limitName;

    private String actionName;

    private String parentId;

    private String parentName;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date creationTime;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date modificationTime;
    //父下边的子
    private List<LimitFunction> limitFunctionsChild;

}
