package com.hospital_purchase.controller;

import com.github.pagehelper.PageInfo;
import com.hospital_purchase.pojo.Supplier;
import com.hospital_purchase.service.SupplierService;
import com.hospital_purchase.vo.DrugItemsVO;
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

    @RequestMapping("fandspId")
    @ResponseBody
    public Supplier fandspId(Integer spId){
        return supplierService.fandspId(spId);
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

    /**
     * 修改供货商信息
     * @param supplier 传入前端修改后的值
     * @return 更新条数,判断是否更新完成
     */
    @RequestMapping("revampsupplier")
    @ResponseBody
    public Integer revamp(Supplier supplier){
        return supplierService.revampsupplier(supplier);
    }

    /**
     * 添加一个供货商信息
     * @param supplier 新增的供货商的数据
     * @return 数据库更新了几条数据,用来判断是否添加成功
     */
    @RequestMapping("addSupplier")
    @ResponseBody
    public Integer addDrugItems(Supplier supplier){
        Integer integer = supplierService.addSupplier(supplier);
        return integer;
    }

    /**
     * 根据ID删除某条数据,
     * @param spId 要删除的数据的ID
     * @return 数据库更新条数,判断是否操作成功
     */
    @RequestMapping("expurgate")
    @ResponseBody
    public Integer expurgate(Integer spId){
        return supplierService.expurgate(spId);
    }
}
