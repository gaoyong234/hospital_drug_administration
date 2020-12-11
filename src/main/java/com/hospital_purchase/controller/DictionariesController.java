package com.hospital_purchase.controller;

import com.github.pagehelper.PageInfo;
import com.hospital_purchase.pojo.Dictionaries;
import com.hospital_purchase.service.DictionariesService;
import com.hospital_purchase.vo.DictionariesVO;
import com.hospital_purchase.vo.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/Dictionaries")
public class DictionariesController {
    @Autowired
    private DictionariesService dictionariesService;

    @RequestMapping("/toDictionaries")
    public String toDictionaries(){
        return "dictionaries/Dictionaries";
    }
    @RequestMapping("/findAllDictionaries")
    @ResponseBody
    public PageInfo findAllDictionaries(Integer pageNum, Integer pageSize){
        return dictionariesService.findAllDictionaries(pageNum,pageSize);
    }

    /**
     *  查所有父字典
     * @return 所有父字典
     */
    @RequestMapping("/findParentDictionaries")
    @ResponseBody
    public List findParentDictionaries(){
        return dictionariesService.findParentDictionaries();
    }

    /**
     *  获得父下的所有子
     * @param dictionariesId 父id
     * @return 父下的所有子
     */
    @RequestMapping("/findChildByParentId")
    @ResponseBody
    public List findChildByParentId(Integer dictionariesId){
        return dictionariesService.findChildByParentId(dictionariesId);
    }

    /**
     *  添加字典数据
     * @param dictionaries 字典所有数据
     * @return 成功/失败信息
     */
    @RequestMapping("/addDictionaries")
    @ResponseBody
    public Message addDictionaries(Dictionaries dictionaries){
        return dictionariesService.addDictionaries(dictionaries);
    }

    /**
     *  删除字典表
     * @param dicId 要删除的id
     * @return 成功/失败信息
     */
    @RequestMapping("/removeDictionariesDel")
    @ResponseBody
    public Message removeDictionariesDel(Integer dicId){
        return dictionariesService.removeDictionariesDel(dicId);
    }

    /**
     *  修改字典
     * @param dictionaries  修改数据
     * @return 成功/失败信息
     */
    @RequestMapping("/changeDictionaries")
    @ResponseBody
    public Message changeDictionaries(Dictionaries dictionaries){
        return dictionariesService.changeDictionaries(dictionaries);
    }

    /**
     * 查单条
     * @param dicId 字典id
     * @return 单条数据
     */
    @RequestMapping("/findDictionariesById")
    @ResponseBody
    public DictionariesVO findDictionariesById(Integer dicId){
        return dictionariesService.findDictionariesById(dicId);
    }

}
