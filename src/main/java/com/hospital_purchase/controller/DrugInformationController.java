package com.hospital_purchase.controller;

import com.hospital_purchase.common.DrugInformationDto;
import com.hospital_purchase.pojo.Dictionaries;
import com.hospital_purchase.pojo.DrugItems;
import com.hospital_purchase.pojo.DrugMessage;
import com.hospital_purchase.service.DrugInformationService;
import com.hospital_purchase.vo.DrugInformationVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/drugInformation")
public class DrugInformationController {

    @Autowired
    private DrugInformationService drugInformationService;

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
     * @param model
     * @return
     */
    @ResponseBody
    @RequestMapping("/findDrugItemsInfo")
    public List<DrugItems> findDrugItemsInfo(Model model){
        List<DrugItems> list = drugInformationService.findDrugItemsInfo();
        model.addAttribute("lists",list);
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
    public List<DrugItems> findAllDrugInfoLike(DrugInformationVO drugInformationVO){
        List<DrugItems> list = drugInformationService.findAllDrugInfoLike(drugInformationVO);
        return list;
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
}
