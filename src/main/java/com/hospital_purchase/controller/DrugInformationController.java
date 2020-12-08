package com.hospital_purchase.controller;

import com.github.pagehelper.PageInfo;
import com.hospital_purchase.common.DrugInformationDto;
import com.hospital_purchase.pojo.Dictionaries;
import com.hospital_purchase.pojo.DrugItems;
import com.hospital_purchase.pojo.DrugMessage;
import com.hospital_purchase.service.DrugInformationService;
import com.hospital_purchase.util.ExcelUploadUtil;
import com.hospital_purchase.vo.DrugInformationVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/drugInformation")
public class DrugInformationController {

    @Autowired
    private DrugInformationService drugInformationService;
    @Bean
    private ExcelUploadUtil excelUploadUtil(){
        return new ExcelUploadUtil();
    }

    /**
     * 2020/11/30
     * 跳转药品信息页面（drugInformation）
     * @return
     */
    @RequestMapping("/toDrugInformation")
    public String toDrugInformation() {
        return "druginfo/drugInformation";
    }

    /**
     * 2020/11/30
     * 查询药品信息维护
     * @return
     */
    @ResponseBody
    @RequestMapping("/findDrugItemsInfo")
    public List<DrugItems> findDrugItemsInfo(){
        List<DrugItems> list = drugInformationService.findDrugItemsInfo();
        return list;
    }

    /***
     * 2020/12/1
     * 模糊查询 + 查询药品信息维护
     * @param drugInformationVO
     * @return
     */
    @ResponseBody
    @RequestMapping("/findAllDrugInfoLike")
    public PageInfo<DrugItems> findAllDrugInfoLike(@RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum,
                                                   @RequestParam(value = "pageSize",defaultValue = "5")Integer pageSize,
                                                   DrugInformationVO drugInformationVO){
        PageInfo<DrugItems> pageInfo = drugInformationService.findAllDrugInfoLike(pageNum,pageSize,drugInformationVO);

        return pageInfo;
    }

    /**
     * 2020/12/1
     * 查询质量层次信息
     * @return
     */
    @ResponseBody
    @RequestMapping("/findQualityLevel")
    public List<Dictionaries> findQualityLevel(){
        List<Dictionaries> qualityLevel = drugInformationService.findQualityLevel();
        return qualityLevel;
    }

    /**
     * 2020/12/1
     * 查询药品类别信息
     * @return
     */
    @ResponseBody
    @RequestMapping("/findDrugCategorys")
    public List<Dictionaries> findDrugCategorys(){
        return drugInformationService.findDrugCategorys();
    }

    /**
     * 2020/12/1
     * 新增药品信息
     * @param drugInformationDto
     * @return
     */
    @ResponseBody
    @RequestMapping("/addDrugInformation")
    public String addDrugInformation(DrugInformationDto drugInformationDto){
        String msg="添加失败";
        DrugItems drugItems = new DrugItems();
        DrugMessage drugMessage = new DrugMessage();

        drugItems.setSerialNumber(drugInformationDto.getSerialNumber());
        drugItems.setCommonName(drugInformationDto.getCommonName());
        drugItems.setDosageForm(drugInformationDto.getDosageForm());
        drugItems.setSpeciflcation(drugInformationDto.getSpeciflcation());
        drugItems.setUnitId(drugInformationDto.getUnitId());
        drugItems.setCoefficient(drugInformationDto.getCoefficient());
        drugItems.setProductionName(drugInformationDto.getProductionName());
        drugItems.setCommodityName(drugInformationDto.getCommodityName());
        drugMessage.setBiddingPrice(drugInformationDto.getBiddingPrice());
        drugMessage.setApprovalNumber(drugInformationDto.getApprovalNumber());
        drugMessage.setApprovalTime(drugInformationDto.getApprovalTime());
        drugMessage.setIsEntrance(drugInformationDto.getIsEntrance());
        drugMessage.setPackagingTexture(drugInformationDto.getPackagingTexture());
        drugMessage.setPackUnit(drugInformationDto.getPackUnit());
        drugMessage.setNewestPrice(drugInformationDto.getNewestPrice());
        drugMessage.setRetailProvenance(drugInformationDto.getRetailProvenance());
        drugMessage.setQualityLevel(drugInformationDto.getQualityLevel());
        drugMessage.setQualityLevelExplain(drugInformationDto.getQualityLevelExplain());
        drugMessage.setIsCheckout(drugInformationDto.getIsCheckout());
        drugMessage.setHeckoutNumber(drugInformationDto.getHeckoutNumber());
        drugMessage.setDrugValidTime(drugInformationDto.getDrugValidTime());
        drugMessage.setProductExplain(drugInformationDto.getProductExplain());
        drugItems.setDrugCategory(drugInformationDto.getDrugCategory());
        drugItems.setDrugState(drugInformationDto.getDrugState());

        int i = drugInformationService.addDrugInformation(drugItems);
        drugMessage.setDrugItemsId(drugItems.getDiId());
        int y = drugInformationService.addDrugMessageInfo(drugMessage);
        if (i>0 && y>0){
            msg = "添加成功";
        }else {
            msg = "添加失败";
        }
        return msg;
    }

    /**
     * 2020/12/3
     * 修改药品信息
     * @param drugInformationDto
     * @return
     */
    @ResponseBody
    @RequestMapping("/updateDrugInformation")
    public String updateDrugInformation(DrugInformationDto drugInformationDto){
        String msg = "修改失败";
        DrugItems drugItems = new DrugItems();
        DrugMessage drugMessage = new DrugMessage();

        drugItems.setDiId(drugInformationDto.getDiId());
        drugItems.setSerialNumber(drugInformationDto.getSerialNumber());
        drugItems.setCommonName(drugInformationDto.getCommonName());
        drugItems.setDosageForm(drugInformationDto.getDosageForm());
        drugItems.setSpeciflcation(drugInformationDto.getSpeciflcation());
        drugItems.setUnitId(drugInformationDto.getUnitId());
        drugItems.setCoefficient(drugInformationDto.getCoefficient());
        drugItems.setProductionName(drugInformationDto.getProductionName());
        drugItems.setCommodityName(drugInformationDto.getCommodityName());
        drugMessage.setDrugItemsId(drugItems.getDiId());
        drugMessage.setBiddingPrice(drugInformationDto.getBiddingPrice());
        drugMessage.setApprovalNumber(drugInformationDto.getApprovalNumber());
        drugMessage.setApprovalTime(drugInformationDto.getApprovalTime());
        drugMessage.setIsEntrance(drugInformationDto.getIsEntrance());
        drugMessage.setPackagingTexture(drugInformationDto.getPackagingTexture());
        drugMessage.setPackUnit(drugInformationDto.getPackUnit());
        drugMessage.setNewestPrice(drugInformationDto.getNewestPrice());
        drugMessage.setRetailProvenance(drugInformationDto.getRetailProvenance());
        drugMessage.setIsCheckout(drugInformationDto.getIsCheckout());
        drugMessage.setHeckoutNumber(drugInformationDto.getHeckoutNumber());
        drugMessage.setDrugValidTime(drugInformationDto.getDrugValidTime());
        drugMessage.setProductExplain(drugInformationDto.getProductExplain());
        drugItems.setDrugState(drugInformationDto.getDrugState());

        int i = drugInformationService.updateDrugInformation(drugItems);
        int y = drugInformationService.updateDrugMessageInformation(drugMessage);
        if (i>0 || y>0){
            msg = "修改成功";
        }else {
            msg = "修改失败";
        }
        return msg;
    }

    /**
     * 2020/12/3
     * 删除药品信息
     * @param id
     * @return
     */
    @ResponseBody
    @RequestMapping("/delDrugInformation")
    public String delDrugInformation(Integer id){
        String msg = "删除失败";
        int i = drugInformationService.delDrugInformation(id);
        if(i>0){
            msg = "删除成功";
        }else {
            msg = "删除失败";
        }
        return msg;
    }

    /*@ResponseBody
    @RequestMapping(value = "/ImportExcel",method = RequestMethod.POST,produces = {"application/json;charset=utf-8"})
    public void ImportExcel(@RequestParam("filename")MultipartFile file,
                            HttpServletRequest request,HttpServletResponse response) throws Exception {
        InputStream inputStream = file.getInputStream();
        EasyExcel easyExcel = new EasyExcel();
        List<Object> reader = easyExcel.reader(inputStream);
        for (int i = 0; i <reader.size() ; i++) {
            System.out.println(reader.get(i));
        }
    }*/
    @ResponseBody
    @RequestMapping(value = "/ImportExcel",method = RequestMethod.POST,produces = {"application/json;charset=utf-8"})
    public void ImportExcel(@RequestParam("filename")MultipartFile file,
                            HttpServletRequest request,HttpServletResponse response) {
        InputStream inputStream = null;
        String originalFilename = file.getOriginalFilename();
        try {
            inputStream = file.getInputStream();
            inputStream = new BufferedInputStream(file.getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<Object> list = excelUploadUtil().reader(inputStream);
        //表头信息
        List<String> s  = (List<String>) list.get(0);
        System.out.println(s);
            for (int i = 1; i <list.size() ; i++) {
            DrugItems drugItems = new DrugItems();
            List<String> tableData = (List<String>) list.get(i);
            if (tableData.size()<s.size()){
                //获得每一个单元格数据
                if (tableData.get(0) != null && !"".equals(tableData.get(0))){
                    drugItems.setSerialNumber(tableData.get(0).trim());
                }
                if (tableData.get(1) != null && !"".equals(tableData.get(1))){
                    drugItems.setCommonName(tableData.get(1).trim());
                }
                if (tableData.get(2) != null && !"".equals(tableData.get(2))){
                    drugItems.setDosageForm(tableData.get(2).trim());
                }
                if (tableData.get(3) != null && !"".equals(tableData.get(3))){
                    drugItems.setSpeciflcation(tableData.get(3).trim());
                }
                drugInformationService.addDrugInformation(drugItems);
            }
        }
    }
}
