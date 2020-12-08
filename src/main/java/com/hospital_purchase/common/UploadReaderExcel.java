package com.hospital_purchase.common;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;

import java.util.ArrayList;
import java.util.List;

public class UploadReaderExcel extends AnalysisEventListener {


    List<Object> list = new ArrayList<Object>();

    public List<Object> getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

    @Override
    public void invoke(Object o, AnalysisContext analysisContext) {
        list.add(o);

    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {

    }
}
