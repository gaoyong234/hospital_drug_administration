package com.hospital_purchase.service;

import com.github.pagehelper.PageInfo;
import com.hospital_purchase.pojo.LimitFunction;
import com.hospital_purchase.vo.LimitFunctionVO;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface LimitFunctionService {

    int addLimit(LimitFunction record);
    int changeLimit(LimitFunction record);
    List findParentLimit();
    LimitFunction getOneLimitFunction(Integer id);

    PageInfo findAllLimitFunction(Integer pageNum,Integer pageSize);

    Integer removeLimitFunction(Integer id);

    //查询所有功能
    List<LimitFunctionVO> getAllLimitFunction();
}
