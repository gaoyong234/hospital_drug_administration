package com.hospital_purchase.dao.LimitFunctionDao;

import com.hospital_purchase.pojo.LimitFunction;
import com.hospital_purchase.vo.LimitFunctionVO;

import java.util.List;

public interface LimitFunctionDaoMapper {

    //查询父
    List<LimitFunctionVO> selectParentLimit();

    List<LimitFunctionVO> selectAllLimitFunctionVO();

    List<LimitFunction> selectAllLimitFunction();
    //查询子
    List<LimitFunction> selectChildLimitFunction(Integer lfId);
}
