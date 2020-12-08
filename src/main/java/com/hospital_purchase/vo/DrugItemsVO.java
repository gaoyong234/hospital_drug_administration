package com.hospital_purchase.vo;

public class DrugItemsVO {
    private String diId;

    private String commonName;

    private String dosageForm;

    private String speciflcation;

    private String unitId;

    private String coefficient;

    private String drugStateName;

    private String drugCategoryName;

    @Override
    public String toString() {
        return "DrugItemsVO{" +
                "diId='" + diId + '\'' +
                ", commonName='" + commonName + '\'' +
                ", dosageForm='" + dosageForm + '\'' +
                ", speciflcation='" + speciflcation + '\'' +
                ", unitId='" + unitId + '\'' +
                ", coefficient='" + coefficient + '\'' +
                ", drugStateName='" + drugStateName + '\'' +
                ", drugCategoryName='" + drugCategoryName + '\'' +
                '}';
    }

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
