package com.hospital_purchase.controller;

import com.hospital_purchase.common.DrugInformationDto;
import com.hospital_purchase.pojo.Dictionaries;
import com.hospital_purchase.pojo.DrugItems;
import com.hospital_purchase.service.DrugInformationService;
import com.hospital_purchase.vo.DrugInformationVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
        drugItems.setSerialNumber(drugInformationDto.getSerialNumber());
        drugItems.setCommonName(drugInformationDto.getCommonName());
        drugItems.setDosageForm(drugInformationDto.getDosageForm());
        drugItems.setSpeciflcation(drugInformationDto.getSpeciflcation());
        int i = drugInformationService.addDrugInformation(drugItems);
        if (i<0){
            msg = "添加成功";
        }else {
            msg = "添加失败";
        }
        return msg;
    }
}
