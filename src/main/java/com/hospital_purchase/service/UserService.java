package com.hospital_purchase.service;

import com.github.pagehelper.PageInfo;
import com.hospital_purchase.pojo.User;
import com.hospital_purchase.vo.Message;
import com.hospital_purchase.vo.UserVO;

import java.util.List;

public interface UserService {
    Message loginUser(User record);
    Message getCountUserByAccountAndPassword(Integer userAccount);
    User getOneUserByUserAccountAndPassword(Integer userAccount, String  password);

    User getUserByAccount(Integer userAccount);
    //查所有用户
    PageInfo findUserList(Integer pageNum,Integer pageSize,User user);
    //修改
    Message changeUser(User user);
    //删除
    Message removeUser(Integer usId);
    //添加用户
    Message addUser(User user);
    //查询单条VO
    UserVO findOneUserVOById(Integer usId);
    //查询单条
    User findOneUserById(Integer usId);

}
