package com.hospital_purchase.service.impl;

import com.hospital_purchase.dao.LimitFunctionRole.LimitRoleDaoMapper;
import com.hospital_purchase.pojo.LimitRole;
import com.hospital_purchase.service.LimitRoleService;
import com.hospital_purchase.util.ReturnUtil;
import com.hospital_purchase.vo.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LimitRoleServiceImpl implements LimitRoleService {
    @Autowired
    private LimitRoleDaoMapper limitRoleDaoMapper;

    @Override
    public Message addLimitRole(List<LimitRole> limitRoleList) {
        Integer count = 0;
        for (LimitRole limitRole : limitRoleList) {
            Integer num = limitRoleDaoMapper.insertLimitRole(limitRole);
            if (num>0) {
                count++;
            }
        }
        Message message = ReturnUtil.returnDataOperation("添加", count);
        return message;
    }

    @Override
    public List<LimitRole> findOneLimitRole(Integer roleId) {
        return limitRoleDaoMapper.selectOneLimitRole(roleId);
    }

    @Override
    public Message removeLimitRole(Integer roleId) {
        Integer num = limitRoleDaoMapper.deleteLimitRole(roleId);
        Message message = ReturnUtil.returnDataOperation("删除", num);
        return message;
    }
}
