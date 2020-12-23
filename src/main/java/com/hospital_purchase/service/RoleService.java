package com.hospital_purchase.service;

import com.github.pagehelper.PageInfo;
import com.hospital_purchase.pojo.Role;
import com.hospital_purchase.vo.Message;



public interface RoleService {
    //角色添加
    Message addRole(Role role);
    //查询单条角色数据
    Role findOneRole(Integer roleId);
    //角色查询
    PageInfo<Role> findAllRole(Integer pageNum,Integer pageSize,Role role);
    //角色删除
    Message removeRole(Integer roleId);
    //角色修改
    Message changeRole(Role role);
}
