package com.hospital_purchase.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Message {

    //判断标识
    private boolean estimate;

    //提示语句
    private String slogan;

    //修改了多少条语句
    private Integer count;

}
