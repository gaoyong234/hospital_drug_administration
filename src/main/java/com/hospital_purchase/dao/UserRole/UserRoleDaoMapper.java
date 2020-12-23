package com.hospital_purchase.dao.UserRole;


import com.hospital_purchase.pojo.UserRole;

public interface UserRoleDaoMapper {
    //添加关联数据
    Integer insertUserRole(UserRole userRole);
    //修改数据
    Integer updateUserRole(UserRole userRole);
}