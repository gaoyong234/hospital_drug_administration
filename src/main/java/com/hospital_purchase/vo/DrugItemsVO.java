package com.hospital_purchase.vo;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;

public class DrugItemsVO extends BaseRowModel {
    @ExcelProperty(value = "药品品目" ,index = 0)
    private String diId;

    @ExcelProperty(value = "通用名" ,index = 1)
    private String commonName;

    @ExcelProperty(value = "剂型" ,index = 2)
    private String dosageForm;

    @ExcelProperty(value = "规格" ,index = 3)
    private String speciflcation;

    @ExcelProperty(value = "单位" ,index = 4)
    private String unitId;

    @ExcelProperty(value = "转换系数" ,index = 5)
    private String coefficient;

    @ExcelProperty(value = "状态" ,index = 6)
    private String drugStateName;

    @ExcelProperty(value = "药品类别" ,index = 7)
    private String drugCategoryName;


    public String getCommonName() {
        return commonName;
    }

    public void setCommonName(String commonName) {
        this.commonName = commonName;
    }

    public String getDosageForm() {
        return dosageForm;
    }

    public void setDosageForm(String dosageForm) {
        this.dosageForm = dosageForm;
    }

    public String getSpeciflcation() {
        return speciflcation;
    }

    public void setSpeciflcation(String speciflcation) {
        this.speciflcation = speciflcation;
    }

    public String getDiId() {
        return diId;
    }

    public void setDiId(String diId) {
        this.diId = diId;
    }

    public String getUnitId() {
        return unitId;
    }

    public void setUnitId(String unitId) {
        this.unitId = unitId;
    }

    public String getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(String coefficient) {
        this.coefficient = coefficient;
    }

    public String getDrugStateName() {
        return drugStateName;
    }

    public void setDrugStateName(String drugStateName) {
        this.drugStateName = drugStateName;
    }

    public String getDrugCategoryName() {
        return drugCategoryName;
    }

    public void setDrugCategoryName(String drugCategoryName) {
        this.drugCategoryName = drugCategoryName;
    }
}
