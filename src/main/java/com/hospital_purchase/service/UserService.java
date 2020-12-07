package com.hospital_purchase.service;

import com.hospital_purchase.pojo.User;
import com.hospital_purchase.vo.Message;

public interface UserService {
    Message addUser(User record);
    Message getCountUserByAccountAndPassword(Integer userAccount);
    User getOneUserByUserAccountAndPassword(Integer userAccount, String  password);

    User getUserByAccount(Integer userAccount);

}
