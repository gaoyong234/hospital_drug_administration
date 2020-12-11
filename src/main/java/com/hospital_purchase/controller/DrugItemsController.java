package com.hospital_purchase.controller;

import com.alibaba.excel.ExcelReader;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.github.pagehelper.PageInfo;
import com.hospital_purchase.pojo.DrugItems;
import com.hospital_purchase.service.DurgItemsService;
import com.hospital_purchase.vo.DrugItemsVO;
import com.hospital_purchase.vo.ExcelListener;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("items")
public class DrugItemsController {
    @Autowired
    private DurgItemsService durgItemsService;

    /**
     * 负责跳转页面
     * @return
     */
    @RequestMapping(value = "/durgItemsInquire",method = RequestMethod.GET)
    public String forIndex(){

        return "durgItemsInquire";
    }

    /**
     * 药品品目模糊查询以及分页
     * @param pageNum 当前页
     * @param pageSize 每页个数
     * @param druglist 前端要的查询数据
     * @return 根据数据查询后的集合
     */
    @RequestMapping("/conditionfand")
    @ResponseBody
    public PageInfo<DrugItemsVO> conditionfand(@RequestParam(value = "pageNum",defaultValue = "1") Integer pageNum,
                                               @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize,
                                               DrugItemsVO druglist){
        PageInfo<DrugItemsVO> conditionfand = durgItemsService.conditionfand(pageNum, pageSize, druglist);
        return conditionfand;
    }

    /**
     * 添加一个药品品目
     * @param drugItems 新增的品目的数据
     * @return 数据库更新了几条数据,用来判断是否添加成功
     */
    @RequestMapping("addDrugItems")
    @ResponseBody
    public Integer addDrugItems(DrugItemsVO drugItems){
        Integer integer = durgItemsService.addDrugItems(drugItems);
        return integer;
    }

    /**
     * 修改页面所用到的查询
     * @param diId 根据主键查询
     * @return 主键为diId的药品品目
     */
    @RequestMapping("fandId")
    @ResponseBody
    public DrugItemsVO fandId(Integer diId){
        return durgItemsService.fandId(diId);
    }

    /**
     * 做修改操作
     * @param drugItemsVO 前端返回的要修改的数据
     * @return 返回数据库更新条数,判断是否更新成功
     */
    @RequestMapping("revamp")
    @ResponseBody
    public Integer revamp(DrugItemsVO drugItemsVO){
        return durgItemsService.revampItems(drugItemsVO);
    }

    /**
     * 根据ID删除某条数据,
     * @param diId 要删除的数据的ID
     * @return 数据库更新条数,判断是否操作成功
     */
    @RequestMapping("expurgate")
    @ResponseBody
    public Integer expurgate(Integer diId){
       return durgItemsService.expurgate(diId);
    }

    /**
     * 导出全部数据
     * @param response 前端传回来的,可以解析出地址和名字
     */
    @RequestMapping("exportExcel")
    public void exportExcel(HttpServletResponse response){
        try {
            durgItemsService.exportExcel(response);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @RequestMapping("loadtemplate")
    public void loadtemplate(HttpServletResponse response){
        try {
            durgItemsService.loadtemplate(response);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("readfile")
    @ResponseBody
    public DrugItemsVO readfile(@RequestParam("filename") MultipartFile file) {
        InputStream inputStream = null;
        try {
            inputStream = file.getInputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String fileName = file.getName();
        //实例化实现了AnalysisEventListener接口的类
        ExcelListener listener = new ExcelListener();
        //传入参数
        ExcelReader excelReader = null;
        if (fileName.endsWith(".xls")) {
            excelReader = new ExcelReader(inputStream, ExcelTypeEnum.XLS, null, listener);

        } else if (fileName.endsWith(".xlsx")) {
            excelReader = new ExcelReader(inputStream, ExcelTypeEnum.XLSX, null, listener);
        } else {
            excelReader = new ExcelReader(inputStream, ExcelTypeEnum.XLSX, null, listener);
        }

        //读取信息
        excelReader.read(new Sheet(2, 1, DrugItemsVO.class));

        //获取数据
        List<Object> list = listener.getDatas();

        List<DrugItemsVO> catagoryList = new ArrayList<DrugItemsVO>();
        DrugItemsVO catagory = new DrugItemsVO();

        //转换数据类型,并插入到数据库
        for (int i = 0; i < list.size(); i++) {
            catagory = (DrugItemsVO) list.get(i);
            System.out.println(catagory);
        }
        return null;
    }

}
