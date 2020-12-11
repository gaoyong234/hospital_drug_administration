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

public class DrugInformationTemplateUtil {

    public static void loadtemplate(HttpServletResponse response) throws IOException {
        response.setContentType("application/octet-stream; charset=utf-8");
        response.setHeader("Content-disposition","attachment;fileName="+"drugInfoTemplate.xlsx");
        ServletOutputStream out = response.getOutputStream();

        ExcelWriter writer1 = EasyExcelFactory.getWriter(out);

        Sheet sheet1 = new Sheet(1, 0);
        Sheet sheet2 = new Sheet(2, 0);

        sheet1.setSheetName("药品信息");
        sheet2.setSheetName("导入说明");

        Table table1 = new Table(1);
        Table table2 = new Table(1);

        List<List<String>> listherd = retEaExcelherd();
        List<List<String>> listbody = retEaExcelBody();

        table1.setHead(listherd);
        writer1.write1(null,sheet1,table1);

        table2.setHead(listbody);
        writer1.write1(null,sheet2,table2);
        writer1.merge(0,6,0,8);

        writer1.finish();
        out.close();
    }



    public static List<List<String>> retEaExcelBody() {
        List<List<String>> rows = new ArrayList<>();
        List<String>  row= new ArrayList<>();
        row.add("1,请在第二个工作表填写药品信息,通用名.剂型.规格.单位.转换系数这几项为药品品目信息，必须已在药品品目信息中能查询到.\n 2.流水号，通用名，剂型，规格，单位，转换系数，生产企业名称，商品名称为必填项，通用名，剂型，规格，单位，转换系数，生产企业名称，商品名称唯一确定一个药品信息不允许重复导入，如果流水号在系统中已存在也不允许重复导入");
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
        List<String>  row7= new ArrayList<>();
        List<String>  row8= new ArrayList<>();
        List<String>  row9= new ArrayList<>();
        List<String>  row10= new ArrayList<>();
        List<String>  row11= new ArrayList<>();
        List<String>  row12= new ArrayList<>();
        List<String>  row13= new ArrayList<>();
        List<String>  row14= new ArrayList<>();
        List<String>  row15= new ArrayList<>();
        List<String>  row16= new ArrayList<>();
        List<String>  row17= new ArrayList<>();
        List<String>  row18= new ArrayList<>();
        List<String>  row19= new ArrayList<>();
        List<String>  row20= new ArrayList<>();
        List<String>  row21= new ArrayList<>();
        List<String>  row22= new ArrayList<>();
        row1.add("流水号");
        row2.add("通用名");
        row3.add("剂型");
        row4.add("规格");
        row5.add("单位");
        row6.add("转换系数");
        row7.add("生产企业");
        row8.add("商品名称");
        row9.add("中标价格");
        row10.add("质量层次");
        row11.add("批准文号");
        row12.add("批准文号有效期");
        row13.add("是否进口");
        row14.add("包装材质");
        row15.add("包装单位");
        row16.add("最新零售价");
        row17.add("零售价出处");
        row18.add("有无药品检验报告");
        row19.add("药品检验报告编码");
        row20.add("药品检验报告有效期");
        row21.add("产品说明");
        row22.add("药品类别");
        rows.add(row1);
        rows.add(row2);
        rows.add(row3);
        rows.add(row4);
        rows.add(row5);
        rows.add(row6);
        rows.add(row7);
        rows.add(row8);
        rows.add(row9);
        rows.add(row10);
        rows.add(row11);
        rows.add(row12);
        rows.add(row13);
        rows.add(row14);
        rows.add(row15);
        rows.add(row16);
        rows.add(row17);
        rows.add(row18);
        rows.add(row19);
        rows.add(row20);
        rows.add(row21);
        rows.add(row22);
        return rows;
    }

}
