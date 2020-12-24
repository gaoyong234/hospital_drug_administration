package com.hospital_purchase.dao.LimitFunctionRole;


import com.hospital_purchase.pojo.LimitRole;
import com.hospital_purchase.pojo.Role;

import java.util.List;

public interface LimitRoleDaoMapper {
    //角色添加权限
    Integer insertLimitRole(LimitRole limitRole);
    //查询角色的所有权限
    List<LimitRole> selectOneLimitRole(Integer roleId);
    //角色删除
    Integer deleteLimitRole(Integer roleId);

}