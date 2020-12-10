package com.hospital_purchase.util;

import com.alibaba.excel.EasyExcelFactory;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.metadata.Table;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EasyExcelUtil {
    public static void loadtemplate(HttpServletResponse response) throws IOException {
        response.setContentType("application/octet-stream; charset=utf-8");
        response.setHeader("Content-disposition","attachment;filename="+"template.xlsx");
        ServletOutputStream out = response.getOutputStream();

        ExcelWriter writer1 = EasyExcelFactory.getWriter(out);

        Sheet sheet1 = new Sheet(1, 0);
        Sheet sheet2 = new Sheet(2, 0);

        sheet1.setSheetName("导入说明");
        sheet2.setSheetName("药品品目");

        Table table = new Table(1);
        Table table2=new Table(1);
        List<List<String>> listherd = retEaExcelherd();
        List<List<String>> listbody = retEaExcelBody();
        table2.setHead(listbody);
        writer1.write1(null,sheet1,table2);
        writer1.merge(0,6,0,8);
        table.setHead(listherd);
        writer1.write1(null,sheet2,table);

        writer1.finish();
        out.close();
    }



    public static List<List<String>> retEaExcelBody() {
        List<List<String>> rows = new ArrayList<>();
        List<String>  row= new ArrayList<>();
        row.add("1,请在第二个工作表填写药品品目信息,通用名.剂型.规格.单位.转换系数这五项必填,这五项唯一确定一个品目信息,请不要重复录入.\n 2.药品类别需填入类别别称,请进入数据字幕菜单'药品类别'查看.此项不录入也可导入成功.");
        rows.add(row);
        return rows;
    }

    public static List<List<String>> retEaExcelherd(){
        List<List<String>> rows = new ArrayList<>();
        List<String>  row1= new ArrayList<>();
        List<String>  row2= new ArrayList<>();
        List<String>  row3= new ArrayList<>();
        List<String>  row4= new ArrayList<>();
        List<String>  row5= new ArrayList<>();
        List<String>  row6= new ArrayList<>();
            row1.add("通用名");
            row2.add("剂型");
            row3.add("规格");
            row4.add("单位");
            row5.add("转换系数");
            row6.add("药品类别");
        rows.add(row1);
        rows.add(row2);
        rows.add(row3);
        rows.add(row4);
        rows.add(row5);
        rows.add(row6);
        return rows;
    }
}
