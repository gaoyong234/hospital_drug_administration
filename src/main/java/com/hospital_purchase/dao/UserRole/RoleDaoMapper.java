package com.hospital_purchase.dao.UserRole;


import com.hospital_purchase.pojo.Role;

import java.util.List;

public interface RoleDaoMapper {
    //角色添加
    Integer insertRole(Role role);
    //查询单条角色数据
    Role selectOneRole(Integer roleId);
    //角色查询
    List<Role> selectAllRole(Role role);
    //角色删除
    Integer deleteRole(Integer roleId);
    //角色修改
    Integer updateRole(Role role);
}