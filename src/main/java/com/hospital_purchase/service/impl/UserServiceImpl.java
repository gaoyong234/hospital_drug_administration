package com.hospital_purchase.service.impl;

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
     * 用户登录
     * @param user
     * @return
     */
    @Override
    public int getCountUserByAccountAndPassword(User user) {

        User admin = userMapper.selectByPrimaryKey(user.getUsId());
        if(user.getUserPassword()!=null &&MD5Util.md5Encrypt32Upper(user.getUserPassword()).equals(admin.getUserPassword())){
            if (user.getUserAccount()!=null &&user.getUserAccount().equals(admin.getUserAccount())){

            }
        }

        return 0;
    }

}
