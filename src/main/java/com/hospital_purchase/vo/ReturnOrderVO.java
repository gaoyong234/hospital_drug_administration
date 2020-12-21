package com.hospital_purchase.vo;

import javax.xml.crypto.Data;
import java.math.BigDecimal;

public class ReturnOrderVO {
    private Integer srId;
    private String purchase_number;//采购单编码
    private String purchase_name;//采购单名称
    private String hospital_name;//采购医院
    private String serial_number;//流水号
    private String common_name;//通用名
    private String commodity_name;//商品名
    private BigDecimal bidding_price;//中标价格
    private BigDecimal deal_price;//交易价格
    //实际交易金额
    private Integer purchase_quantity;//采购量
    private BigDecimal purchase_total_amount;//采购金额
    private Integer storage_volume;//入库量
    private String invoice;//发票号或入库单号
    private String drug_batch_number;//药品批号
    private String effective_time;//药品有效期
    private String dosage_form;//剂型
    private String speciflcation;//规格
    private String unit_id;//单位
    private Integer coefficient;//转换系数
    private String quality_level;//质量层次
    private String production_name;//生产企业
    private String supplier_name;//供货企业
    private Data begin_time;//开始采购时间
    private Data end_time;//结束采购时间
    private String purchase_state;//采购状态
}
