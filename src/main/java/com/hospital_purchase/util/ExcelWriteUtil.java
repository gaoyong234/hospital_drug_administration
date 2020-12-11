package com.hospital_purchase.util;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

public class ExcelWriteUtil<T> {


    public Workbook getWorkBook(String fileName, String[] headers,
                                List<T> result, String privateMethods[]){
        Workbook workbook =null;
        if (fileName!=null&&!"".equals(fileName)){
            if (fileName.endsWith(".xlsx")){
                workbook = new XSSFWorkbook();
            }else if (fileName.endsWith("xls")){
                workbook = new HSSFWorkbook();
            }else {
                workbook = new HSSFWorkbook();
            }
        }else {
            workbook = new HSSFWorkbook();
        }
        Sheet sheet = workbook.createSheet("表格名称");

        Row row = sheet.createRow(0);
        //赋值表头
        for (int i = 0; i < headers.length; i++) {
            Cell cell = row.createCell(i);
            cell.setCellValue(headers[i]);
        }
        for (int i = 0; i < result.size(); i++) {
            Row row1 = sheet.createRow(i + 1);
            T t = result.get(i);
            Class aClass = t.getClass();
            for (int j = 0; j < privateMethods.length; j++) {
                Cell cell = row1.createCell(j);
                String name = privateMethods[j];
                String methodName = "get"+name.substring(0,1).toUpperCase()+name.substring(1);
                try {
                    Method method = aClass.getMethod(methodName, null);
                    Object invoke = method.invoke(t, null);
                    String value ="";
                    if (invoke!=null){
                        value = invoke.toString();
                    }else{
                        value = "";
                    }
                    cell.setCellValue(value);
                } catch (NoSuchMethodException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }


        return workbook;
    }


}
