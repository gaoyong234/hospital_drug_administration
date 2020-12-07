package com.hospital_purchase.controller;

import com.hospital_purchase.pojo.User;
import com.hospital_purchase.service.UserService;
import com.hospital_purchase.util.MD5Util;
import com.hospital_purchase.vo.Message;
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
    public Message userLogin(Integer userAccount, String userPassword, HttpSession httpSession){
        //通过用户名密码查到用户信息
        User admin = userService.getUserByAccount(userAccount);
        Message m = new Message();
        if (admin!=null) {
            if (userPassword != null && MD5Util.md5Encrypt32Upper(userPassword).equals(admin.getUserPassword())) {
                httpSession.setAttribute("admin", admin);
                m.setEstimate(true);
                m.setSlogan("都正确！！");
            }else {
                m.setEstimate(false);
                m.setSlogan("登录密码不正确！！");
            }
        }else {
            m.setEstimate(false);
            m.setSlogan("未找到该用户！！");
        }
        return m;
    }

    /**
     *
     * @param userAccount 输入注册账号
     * @return 判断账号是否存在
     */
    @RequestMapping("/userExist")
    @ResponseBody
    public Message userExist(Integer userAccount){

        return userService.getCountUserByAccountAndPassword(userAccount);

    }

    /**
     *  用户是否注册成功信息
     * @param user 用户信息
     * @return 返回信息
     */
    @RequestMapping("/addUser")
    @ResponseBody
    public Message addUser(User user){
        return userService.addUser(user);
    }
}
