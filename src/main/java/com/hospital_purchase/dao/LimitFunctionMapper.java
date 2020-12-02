package com.hospital_purchase.dao;

import com.hospital_purchase.pojo.LimitFunction;
import com.hospital_purchase.vo.LimitFunctionVO;

import java.util.List;

public interface LimitFunctionMapper {
    int deleteByPrimaryKey(Integer lfId);

    int insert(LimitFunction record);

    int insertSelective(LimitFunction record);

    LimitFunction selectByPrimaryKey(Integer lfId);

    int updateByPrimaryKeySelective(LimitFunction record);

    int updateByPrimaryKey(LimitFunction record);

    List selectParentLimit();

    List<LimitFunctionVO> selectAllLimitFunctionVO();

    List<LimitFunction> selectAllLimitFunction();
}