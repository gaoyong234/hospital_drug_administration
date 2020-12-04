package com.hospital_purchase.service.impl;

import com.hospital_purchase.dao.User.UserDaoMapper;
import com.hospital_purchase.dao.UserMapper;
import com.hospital_purchase.pojo.User;
import com.hospital_purchase.service.UserService;
import com.hospital_purchase.util.MD5Util;
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
    public int addUser(User record) {
        //密码加密
        record.setUserPassword(MD5Util.md5Encrypt32Upper(record.getUserPassword()));
        record.setCreationTime(new Date());// new Date()为获取当前系统时间
        return userMapper.insertSelective(record);
    }

    /**
     *  判断用户是否存在
     * @param userAccount 账号
     * @param password 密码
     * @return 是否存在
     */
    @Override
    public int getCountUserByAccountAndPassword(Integer userAccount) {

        return userDaoMapper.countUserByAccountPassword(userAccount);
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
