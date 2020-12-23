package com.hospital_purchase.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hospital_purchase.dao.UserRole.RoleDaoMapper;
import com.hospital_purchase.pojo.Role;
import com.hospital_purchase.service.RoleService;
import com.hospital_purchase.util.ReturnUtil;
import com.hospital_purchase.vo.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleDaoMapper roleDaoMapper;
    @Override
    public Message addRole(Role role) {
        role.setCreationTime(new Date());
        Integer num = roleDaoMapper.insertRole(role);
        Message message = ReturnUtil.returnDataOperation("添加", num);
        return message;
    }

    @Override
    public Role findOneRole(Integer roleId) {
        return roleDaoMapper.selectOneRole(roleId);
    }

    @Override
    public PageInfo<Role> findAllRole(Integer pageNum , Integer pageSize,Role role) {
        PageHelper.startPage(pageNum,pageSize);

        List<Role> roles = roleDaoMapper.selectAllRole(role);
        PageInfo<Role> pageInfo = new PageInfo<>(roles);
        return pageInfo;
    }

    @Override
    public Message removeRole(Integer roleId) {
        Integer num = roleDaoMapper.deleteRole(roleId);
        Message message = ReturnUtil.returnDataOperation("删除", num);
        return message;
    }

    @Override
    public Message changeRole(Role role) {
        role.setModificationTime(new Date());
        Integer num = roleDaoMapper.updateRole(role);
        Message message = ReturnUtil.returnDataOperation("修改", num);
        return message;
    }
}
