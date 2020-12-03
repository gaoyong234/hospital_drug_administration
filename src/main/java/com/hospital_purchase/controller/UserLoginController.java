package com.hospital_purchase.controller;

import com.hospital_purchase.pojo.User;
import com.hospital_purchase.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/userController")
public class UserLoginController {
    @Autowired
    private UserService userService;

    /**
     *
     * @param user 用户名密码
     * @return 登录主页
     */
    @RequestMapping("/userLogin")
    @ResponseBody
    public String userLogin(User user, HttpSession httpSession){
        //通过用户名密码查到用户信息
        int count = userService.getCountUserByAccountAndPassword(user);
        if (count>0){
            httpSession.setAttribute("user",user);

        }
        System.out.println("我来了");

        return "index1";
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
