package com.hospital_purchase.controller;

import com.hospital_purchase.pojo.User;
import com.hospital_purchase.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserLoginController {
    @Autowired
    private UserService userService;

    /**
     *
     * @param user 用户名密码
     * @return 登录主页
     */
    @RequestMapping("/userLogin")
    public String userLogin(User user){

        return "";
    }

    /**
     *
     * @param user 用户信息
     * @return 注册成功页面
     */
    @RequestMapping("/userRegistration")
    public String userRegistration(User user){

        return "";
    }
}
