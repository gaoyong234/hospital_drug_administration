package com.hospital_purchase.service.impl;

import com.hospital_purchase.dao.User.UserDaoMapper;
import com.hospital_purchase.dao.UserMapper;
import com.hospital_purchase.pojo.User;
import com.hospital_purchase.service.UserService;
import com.hospital_purchase.util.MD5Util;
import com.hospital_purchase.vo.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Date;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserDaoMapper userDaoMapper;

    /**
     * 添加用户
     * @param record 用户信息
     * @return
     */
    @Override
    public Message addUser(User record) {
        Message m = new Message();
        //密码加密
        record.setUserPassword(MD5Util.md5Encrypt32Upper(record.getUserPassword()));
        record.setCreationTime(new Date());// new Date()为获取当前系统时间
        int count = userMapper.insertSelective(record);
        if (count>0){
            m.setSlogan("注册成功去登陆！！");
            m.setEstimate(true);

        }else {
            m.setSlogan("未注册成功请重新注册！！");
            m.setEstimate(false);
        }
        return m;
    }

    /**
     *  判断用户是否存在
     * @param userAccount 账号
     * @return 是否存在
     */
    @Override
    public Message getCountUserByAccountAndPassword(Integer userAccount) {
        Message m = new Message();
        Integer count = userDaoMapper.countUserByAccountPassword(userAccount);
        if (count>0){
            m.setEstimate(false);
            m.setSlogan("该账号已被注册！！");
        }else {
            m.setSlogan("未被注册！！");
            m.setEstimate(true);
        }
        return m;
    }

    /**
     *
     * @param userAccount
     * @param password
     * @return
     */
    @Override
    public User getOneUserByUserAccountAndPassword(Integer userAccount, String password) {
        return userDaoMapper.selectOneUser(userAccount,password);
    }

    @Override
    public User getUserByAccount(Integer userAccount) {

        User user = userDaoMapper.selectUserByAccount(userAccount);

        return user;
    }


}
