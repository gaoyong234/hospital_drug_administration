package com.hospital_purchase.controller;

import com.github.pagehelper.PageInfo;
import com.hospital_purchase.pojo.Supplier;
import com.hospital_purchase.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("supplier")
public class SupplierController {
    @Autowired
    private SupplierService supplierService;
    /**
     * 页面跳转
     * @return 返回要跳转的页面名
     */
    @RequestMapping(value = "/resupplier",method = RequestMethod.GET)
    public String forIndex(){
        return "/supplier/supplier";
    }

    @RequestMapping("/conditionfand")
    @ResponseBody
    public PageInfo<Supplier> conditionfand(@RequestParam(value = "pageNum",defaultValue = "1") Integer pageNum,
                                            @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize,
                                            Supplier supplier){
        PageInfo<Supplier> supplierPageInfo = supplierService.fandAllSupplier(pageNum, pageSize, supplier);
        return supplierPageInfo;
    }

    /**
     * 查询字典表信息
     * @return 返回所有字典表
     */
    @RequestMapping("supplierdiction")
    @ResponseBody
    public List itemsdiCtion(){
        return supplierService.itemsdiCtion();
    }
}
