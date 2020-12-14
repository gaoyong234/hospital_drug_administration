package com.hospital_purchase.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hospital_purchase.dao.User.UserDaoMapper;
import com.hospital_purchase.dao.UserMapper;
import com.hospital_purchase.pojo.User;
import com.hospital_purchase.service.UserService;
import com.hospital_purchase.util.MD5Util;
import com.hospital_purchase.util.ReturnUtil;
import com.hospital_purchase.vo.Message;
import com.hospital_purchase.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Date;
import java.util.List;

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
    public Message loginUser(User record) {
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

    /**
     * 根据账号查询个数
     * @param userAccount
     * @return
     */
    @Override
    public User getUserByAccount(Integer userAccount) {

        User user = userDaoMapper.selectUserByAccount(userAccount);

        return user;
    }

    /**
     * 所有用户信息
     * @param pageNum 首页
     * @param pageSize 每页个数
     * @param user 条件
     * @return 用户数据
     */
    @Override
    public PageInfo findUserList(Integer pageNum,Integer pageSize ,User user) {
        PageHelper.startPage(pageNum,pageSize);
        List list = userDaoMapper.selectUserList(user);
        PageInfo<UserVO> pageInfo = new PageInfo<UserVO>(list);
        return pageInfo;
    }

    /**
     * 修改用户信息
     * @param user
     * @return
     */
    @Override
    public Message changeUser(User user) {
        user.setModificationTime(new Date());
        Integer num = userDaoMapper.updateUser(user);
        Message message = ReturnUtil.returnDataOperation("修改", num);
        return message;
    }

    /**
     * 删除
     * @param usId 用户id
     * @return
     */
    @Override
    public Message removeUser(Integer usId) {
        Integer num = userDaoMapper.updateUserDel(usId);
        Message message = ReturnUtil.returnDataOperation("删除", num);
        return message;
    }

    /**
     * 添加户
     * @param user
     * @return
     */

    @Override
    public Message addUser(User user) {
        user.setCreationTime(new Date());
        Integer num = userDaoMapper.insertUser(user);
        Message message = ReturnUtil.returnDataOperation("添加", num);
        return message;
    }

    @Override
    public UserVO findOneUserVOById(Integer usId) {
        return userDaoMapper.selectOneUserVOById(usId);
    }

    @Override
    public User findOneUserById(Integer usId) {
        return userDaoMapper.selectOneUserById(usId);
    }


}
