package com.hospital_purchase.service;

import com.hospital_purchase.pojo.User;

public interface UserService {
    int addUser(User record);
    int getCountUserByAccountAndPassword(User user);
}
