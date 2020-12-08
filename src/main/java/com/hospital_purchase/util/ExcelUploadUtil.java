package com.hospital_purchase.util;

import com.alibaba.excel.EasyExcelFactory;
import com.alibaba.excel.metadata.Sheet;
import com.hospital_purchase.common.UploadReaderExcel;

import java.io.InputStream;
import java.util.List;
import java.util.regex.Pattern;


public class ExcelUploadUtil {

    public List<Object> reader(InputStream inputStream){

        Sheet sheet = new Sheet(1,1);
        UploadReaderExcel uploadReaderExcel = new UploadReaderExcel();
        EasyExcelFactory.readBySax(inputStream,sheet,uploadReaderExcel);
        List<Object> list = uploadReaderExcel.getList();
        return list;

    }
    //判断ing类型
    public  boolean isInteger(String str) {
        if (null == str || "".equals(str)) {
            return false;
        }
        Pattern pattern = Pattern.compile("^[-\\+]?[\\d]*$");
        return pattern.matcher(str).matches();
    }

    //判断浮点数（double和float）
    public boolean isDouble(String str) {
        if (null == str || "".equals(str)) {
            return false;
        }
        Pattern pattern = Pattern.compile("^[-\\+]?[.\\d]*$");
        return pattern.matcher(str).matches();
    }
}
