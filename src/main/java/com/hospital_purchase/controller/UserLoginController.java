package com.hospital_purchase.controller;

import com.hospital_purchase.pojo.User;
import com.hospital_purchase.service.UserService;
import com.hospital_purchase.util.MD5Util;
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
     * @param userAccount 用户名
     * @param userPassword 密码
     * @param httpSession session
     * @return  登 录主页
     */
    @RequestMapping("/userLogin")
    @ResponseBody
    public Boolean userLogin(Integer userAccount,String userPassword, HttpSession httpSession){
        //通过用户名密码查到用户信息
        User admin = userService.getUserByAccount(userAccount);
        if (admin!=null) {
            if (userPassword != null && MD5Util.md5Encrypt32Upper(userPassword).equals(admin.getUserPassword())) {
                httpSession.setAttribute("admin", admin);
                return true;
            }
        }
            return false;
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
    @RequestMapping("/userExist")
    @ResponseBody
    public Integer userExist(Integer userAccount){

        return userService.getCountUserByAccountAndPassword(userAccount);

    }
}
