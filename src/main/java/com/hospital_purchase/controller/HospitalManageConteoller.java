package com.hospital_purchase.controller;

import com.github.pagehelper.PageInfo;
import com.hospital_purchase.pojo.Dictionaries;
import com.hospital_purchase.pojo.Hospital;
import com.hospital_purchase.service.HospitalManageService;
import com.hospital_purchase.vo.HospitalVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/hospitalManage")
public class HospitalManageConteoller {

    @Autowired
    private HospitalManageService hospitalManageService;

    /**
     * 跳转到医院管理系统界面
     * @return
     */
    @RequestMapping("/toHospitalSystem")
    public String toHospitalSystem(){
        return "hospitalManage/hospitalSystem";
    }

    /**
     * 查询+模糊查询+分页
     * @param pageNum
     * @param pageSize
     * @param hospitalList
     * @return
     */
    @ResponseBody
    @RequestMapping("/findHospital")
    public PageInfo<HospitalVO> findHospital(@RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum,
                                             @RequestParam(value = "pageSize",defaultValue = "5")Integer pageSize,
                                             HospitalVO hospitalList){
        PageInfo<HospitalVO> hospital = hospitalManageService.findHospital(pageNum, pageSize, hospitalList);
        return hospital;
    }

    /**
     * 添加医院信息
     * @param hospital
     * @return
     */
    @ResponseBody
    @RequestMapping("/addHospitaInfo")
    public Integer addHospitaInfo(Hospital hospital){
        hospital.setCreationTime(new Date());
        Integer integer = hospitalManageService.addHospitaInfo(hospital);
        return integer;
    }

    /**
     * 根据主键id查询医院信息
     * @param hpId
     * @return
     */
    @ResponseBody
    @RequestMapping("/queryHospitalInfoById")
    public HospitalVO queryHospitalInfoById (Integer hpId){
        return hospitalManageService.queryHospitalInfoById(hpId);
    }

    /**
     * 根据id修改医院信息
     * @param hospital
     * @return
     */
    @ResponseBody
    @RequestMapping("/updateHospitalInfo")
        public Integer updateHospitalInfo(Hospital hospital){
        hospital.setModificationTime(new Date());
        Integer integer = hospitalManageService.updateHospitalInfo(hospital);
        return integer;
    }

    /**
     * 查询字典表里的医院级别信息
     * @return
     */
    @ResponseBody
    @RequestMapping("/findDictionariesInfo")
    public List findDictionariesInfo(){
        return hospitalManageService.findDictionariesInfo();
    }

    /**
     * 删除医院信息
     * @param hpId
     * @return
     */
    @ResponseBody
    @RequestMapping("/delHospitalInfo")
    public Integer delHospitalInfo(Integer hpId){
        return hospitalManageService.delHospitalInfo(hpId);
    }
}
