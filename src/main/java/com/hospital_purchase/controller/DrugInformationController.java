package com.hospital_purchase.controller;

import com.github.pagehelper.PageInfo;
import com.hospital_purchase.common.DrugInformationDto;
import com.hospital_purchase.common.DrugInformation;
import com.hospital_purchase.pojo.Dictionaries;
import com.hospital_purchase.pojo.DrugItems;
import com.hospital_purchase.pojo.DrugMessage;
import com.hospital_purchase.service.DrugInformationService;
import com.hospital_purchase.util.ExcelUploadUtil;
import com.hospital_purchase.vo.DrugInformationVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

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
     * 跳转药品信息页面（drugInformation）
     * @return
     */
    @RequestMapping("/toDrugInformation")
    public String toDrugInformation() {
        return "druginfo/drugInformation";
    }

    /**
     * 查询药品信息维护
     * @return
     */
    @ResponseBody
    @RequestMapping("/findDrugItemsInfo")
    public List<DrugItems> findDrugItemsInfo(){
        List<DrugItems> list = drugInformationService.findDrugItemsInfo();
        return list;
    }

    /**
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
     * 查询药品类别信息
     * @return
     */
    @ResponseBody
    @RequestMapping("/findDrugCategorys")
    public List<Dictionaries> findDrugCategorys(){
        return drugInformationService.findDrugCategorys();
    }

    /**
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

    /**
     * 导入
     * @param file
     * @param response
     * @param request
     */
    @RequestMapping(value = "/uploadFiles",method = RequestMethod.POST,produces = "application/json;charset=utf-8")
    @ResponseBody
    public void uploadFilesToExcel(@RequestParam(value = "uploadFile")MultipartFile file, HttpServletResponse response, HttpServletRequest request){
        InputStream inputStream = null;
        try {
            inputStream = file.getInputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<Object> list = excelUploadUtil().reader(inputStream);
        //------------------------------------------------------------------
        //表头信息
        List<String> s  = (List<String>) list.get(0);
        for (int i = 0; i < list.size() ;i++) {
            //DrugInformation drugInformation = new DrugInformation();
            DrugItems drugItems = new DrugItems();
            DrugMessage drugMessage = new DrugMessage();
            List<String> tableData = (List<String>) list.get(i);
                //获得每一个单元格数据
                if (tableData.get(0)!=null&&!"".equals(tableData.get(0))) {
                    drugItems.setSerialNumber(tableData.get(0));
                }
                if (tableData.get(1)!=null&&!"".equals(tableData.get(1))) {
                    drugItems.setCommonName(tableData.get(1));
                }
                if (tableData.get(2)!=null&&!"".equals(tableData.get(2))) {
                    drugItems.setDosageForm(tableData.get(2));
                }
                if (tableData.get(3)!=null&&!"".equals(tableData.get(3))) {
                    drugItems.setSpeciflcation(tableData.get(3));
                }
                if (tableData.get(4)!=null&&!"".equals(tableData.get(4))) {
                    drugItems.setUnitId(Integer.parseInt(tableData.get(4).trim()));
                }
                if (tableData.get(5)!=null&&!"".equals(tableData.get(5))) {
                    drugItems.setCoefficient(Integer.parseInt(tableData.get(5).trim()));
                }
                if (tableData.get(6)!=null&&!"".equals(tableData.get(6))) {
                    drugItems.setProductionName(tableData.get(6).trim());
                }
                if (tableData.get(7)!=null&&!"".equals(tableData.get(7))) {
                    drugItems.setCommodityName(tableData.get(7).trim());
                }
                if (tableData.get(8)!=null&&!"".equals(tableData.get(8))) {
                    drugMessage.setBiddingPrice(new BigDecimal(tableData.get(8).trim()));
                }
                if (tableData.get(9)!=null&&!"".equals(tableData.get(9))) {
                    drugMessage.setQualityLevel(tableData.get(9).trim());
                }
                if (tableData.get(10)!=null&&!"".equals(tableData.get(10))) {
                    drugMessage.setApprovalNumber(tableData.get(10).trim());
                }
                SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy.MM.dd");
                try {
                    if (tableData.get(11)!=null&&!"".equals(tableData.get(11))) {
                        drugMessage.setApprovalTime(simpleDateFormat.parse(tableData.get(11).trim()));
                    }
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                if (tableData.get(12)!=null&&!"".equals(tableData.get(12))) {
                    drugMessage.setIsEntrance(new Byte(tableData.get(12).trim()));
                }
                if (tableData.get(13)!=null&&!"".equals(tableData.get(13))) {
                    drugMessage.setPackagingTexture(tableData.get(13).trim());
                }
                if (tableData.get(14)!=null&&!"".equals(tableData.get(14))) {
                    drugMessage.setPackUnit(Integer.parseInt(tableData.get(14).trim()));
                }
                if (tableData.get(15)!=null&&!"".equals(tableData.get(15))) {
                    drugMessage.setNewestPrice(new BigDecimal(tableData.get(15).trim()));
                }
                if (tableData.get(16)!=null&&!"".equals(tableData.get(16))) {
                    drugMessage.setRetailProvenance(tableData.get(16).trim());
                }
                if (tableData.get(17)!=null&&!"".equals(tableData.get(17))) {
                    drugMessage.setIsCheckout(new Byte(tableData.get(17).trim()));
                }
                if (tableData.get(18)!=null&&!"".equals(tableData.get(18))) {
                    drugMessage.setHeckoutNumber(tableData.get(18).trim());
                }
                try {
                    if (tableData.get(19)!=null&&!"".equals(tableData.get(19))) {
                        drugMessage.setDrugValidTime(simpleDateFormat.parse(tableData.get(19).trim()));
                    }
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                if (tableData.get(20)!=null&&!"".equals(tableData.get(20))) {
                    drugMessage.setProductExplain(tableData.get(20).trim());
                }
                drugInformationService.addDrugInformation(drugItems);
                drugMessage.setDrugItemsId(drugItems.getDiId());
                drugInformationService.addDrugMessageInfo(drugMessage);
            }
    }
}
