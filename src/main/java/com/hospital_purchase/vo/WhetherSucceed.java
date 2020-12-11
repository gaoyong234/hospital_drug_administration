package com.hospital_purchase.vo;

import java.util.List;

public class WhetherSucceed {
    int succeed;

    int lose;

    List<DrugItemsVoRead> drugItemsList;

    public List<DrugItemsVoRead> getDrugItemsList() {
        return drugItemsList;
    }

    public void setDrugItemsList(List<DrugItemsVoRead> drugItemsList) {
        this.drugItemsList = drugItemsList;
    }

    public int getSucceed() {
        return succeed;
    }

    public void setSucceed(int succeed) {
        this.succeed = succeed;
    }

    public int getLose() {
        return lose;
    }

    public void setLose(int lose) {
        this.lose = lose;
    }

}
