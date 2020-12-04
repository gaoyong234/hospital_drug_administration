package com.hospital_purchase.service;

import com.hospital_purchase.pojo.User;

public interface UserService {
    int addUser(User record);
    int getCountUserByAccountAndPassword(Integer userAccount);
    User getOneUserByUserAccountAndPassword(Integer userAccount, String  password);

    User getUserByAccount(Integer userAccount);

}
