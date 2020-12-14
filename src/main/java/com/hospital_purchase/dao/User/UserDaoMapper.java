package com.hospital_purchase.dao.User;

import com.hospital_purchase.pojo.User;
import com.hospital_purchase.vo.UserVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDaoMapper {

    /**
     * 根据账号，密码查
     * @param userAccount
     * @param userPassword
     * @return
     */

    User selectOneUser(@Param(value = "userAccount") Integer userAccount, @Param(value = "userPassword") String userPassword);

    /**
     * 根据账号用户个数
     * @param userAccount
     * @return 个数
     */
    Integer countUserByAccountPassword(@Param(value = "userAccount") Integer userAccount);

    /**
     * 根据账号查用户信息
     * @param userAccount 账号
     * @return 用户信息
     */
    User selectUserByAccount(Integer userAccount);
    //查所有用户
    List selectUserList(User user);
    //修改
    Integer updateUser(User user);
    //删除
    Integer updateUserDel(Integer usId);
    //添加
    Integer insertUser(User user);
    //查询单条VO
    UserVO selectOneUserVOById(Integer usId);
    //查询单条
    User selectOneUserById(Integer usId);
}
