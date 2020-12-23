package com.hospital_purchase.controller;

import com.github.pagehelper.PageInfo;
import com.hospital_purchase.pojo.Role;
import com.hospital_purchase.service.RoleService;
import com.hospital_purchase.vo.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/Role")
public class RoleController {
    @Autowired
    private RoleService roleService;

    /**
     * 到角色管理页面
     * @return
     */
    @RequestMapping("/toRole")
    public String toRole(){
        return "/role/Role";
    }

    /**
     * 查询所有角色
     * @param pageNum
     * @param pageSize
     * @param role
     * @return
     */
    @RequestMapping("/findAllRole")
    @ResponseBody
    public PageInfo findAllRole(@RequestParam(value = "pageNum",defaultValue = "1") Integer pageNum,
                                @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize,
                                 Role role){
        return roleService.findAllRole(pageNum,pageSize,role);
    }

    /**
     * 查询单条
     * @param roId
     * @return
     */
    @RequestMapping("/findOneRole")
    @ResponseBody
    public Role findOneRole(Integer roId){
        return roleService.findOneRole(roId);
    }

    /**
     * 修改角色数据
     * @param role
     * @return
     */
    @RequestMapping("/changeRole")
    @ResponseBody
    public Message changeRole(Role role){
        return roleService.changeRole(role);
    }

    /**
     * 删除角色
     * @param roId
     * @return
     */
    @RequestMapping("/removeRole")
    @ResponseBody
    public Message removeRole(Integer roId){
        return roleService.removeRole(roId);
    }

    /**
     * 添加角色
     * @param role
     * @return
     */
    @RequestMapping("/addRole")
    @ResponseBody
    public Message addRole(Role role){
        return roleService.addRole(role);
    }

}
