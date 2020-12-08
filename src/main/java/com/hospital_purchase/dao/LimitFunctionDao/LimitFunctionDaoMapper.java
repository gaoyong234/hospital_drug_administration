package com.hospital_purchase.dao.LimitFunctionDao;

import com.hospital_purchase.pojo.LimitFunction;
import com.hospital_purchase.vo.LimitFunctionVO;

import java.util.List;

public interface LimitFunctionDaoMapper {

    List selectParentLimit();

    List<LimitFunctionVO> selectAllLimitFunctionVO();

    List<LimitFunction> selectAllLimitFunction();
}
