package com.hospital_purchase.service;

import com.hospital_purchase.pojo.LimitRole;
import com.hospital_purchase.vo.Message;

import java.util.List;

public interface LimitRoleService {

    //角色添加权限
    Message addLimitRole(List<LimitRole> limitRole);
    //查询角色的所有权限
    List<LimitRole> findOneLimitRole(Integer roleId);
    //角色删除
    Message removeLimitRole(Integer roleId);
}
