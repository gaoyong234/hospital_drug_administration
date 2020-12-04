package com.hospital_purchase.dao.User;

import com.hospital_purchase.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserDaoMapper {

    User selectOneUser(@Param(value = "userAccount") Integer userAccount, @Param(value = "userPassword") String userPassword);

    Integer countUserByAccountPassword(@Param(value = "userAccount") Integer userAccount);


    User selectUserByAccount(Integer userAccount);
}
