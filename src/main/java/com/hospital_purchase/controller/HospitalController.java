package com.hospital_purchase.controller;

import com.hospital_purchase.pojo.Hospital;
import com.hospital_purchase.pojo.User;
import com.hospital_purchase.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/Hospital")
public class HospitalController {

    @Autowired
    private HospitalService hospitalService;
    @RequestMapping("/findOneHospital")
    @ResponseBody
    public Hospital findOneHospital(HttpSession session){
        System.out.println(session.getAttribute("admin"));
        User user  = (User) session.getAttribute("admin");
        Hospital hospital = hospitalService.findOneHospital(user.getHospitalId());
        System.out.println(hospital);
        return hospital;
    }
}
