package com.hospital_purchase.controller;

import com.github.pagehelper.PageInfo;
import com.hospital_purchase.pojo.DrugItems;
import com.hospital_purchase.service.DurgItemsService;
import com.hospital_purchase.vo.DrugItemsVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;

@Controller
@RequestMapping("items")
public class DrugItemsController {
    @Autowired
    private DurgItemsService durgItemsService;

    /**
     * 负责跳转页面
     * @return
     */
    @RequestMapping(value = "/durgItemsInquire",method = RequestMethod.GET)
    public String forIndex(){

        return "durgItemsInquire";
    }

    /**
     * 药品品目模糊查询以及分页
     * @param pageNum 当前页
     * @param pageSize 每页个数
     * @param druglist 前端要的查询数据
     * @return 根据数据查询后的集合
     */
    @RequestMapping("/conditionfand")
    @ResponseBody
    public PageInfo<DrugItemsVO> conditionfand(@RequestParam(value = "pageNum",defaultValue = "1") Integer pageNum,
                                               @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize,
                                               DrugItemsVO druglist){
        PageInfo<DrugItemsVO> conditionfand = durgItemsService.conditionfand(pageNum, pageSize, druglist);
        return conditionfand;
    }

    /**
     * 添加一个药品品目
     * @param drugItems 新增的品目的数据
     * @return 数据库更新了几条数据,用来判断是否添加成功
     */
    @RequestMapping("addDrugItems")
    @ResponseBody
    public Integer addDrugItems(DrugItemsVO drugItems){
        Integer integer = durgItemsService.addDrugItems(drugItems);
        return integer;
    }

    /**
     * 修改页面所用到的查询
     * @param diId 根据主键查询
     * @return 主键为diId的药品品目
     */
    @RequestMapping("fandId")
    @ResponseBody
    public DrugItemsVO fandId(Integer diId){
        return durgItemsService.fandId(diId);
    }

    /**
     * 做修改操作
     * @param drugItemsVO 前端返回的要修改的数据
     * @return 返回数据库更新条数,判断是否更新成功
     */
    @RequestMapping("revamp")
    @ResponseBody
    public Integer revamp(DrugItemsVO drugItemsVO){
        return durgItemsService.revampItems(drugItemsVO);
    }

    /**
     * 根据ID删除某条数据,
     * @param diId 要删除的数据的ID
     * @return 数据库更新条数,判断是否操作成功
     */
    @RequestMapping("expurgate")
    @ResponseBody
    public Integer expurgate(Integer diId){
       return durgItemsService.expurgate(diId);
    }
}
