package com.hospital_purchase.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hospital_purchase.dao.LimitFunctionDao.LimitFunctionDaoMapper;
import com.hospital_purchase.dao.LimitFunctionMapper;
import com.hospital_purchase.pojo.LimitFunction;
import com.hospital_purchase.service.LimitFunctionService;
import com.hospital_purchase.vo.LimitFunctionVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class LimitFunctionServiceImpl implements LimitFunctionService {
    @Autowired
    private LimitFunctionMapper limitFunctionMapper;
    @Autowired
    private LimitFunctionDaoMapper limitFunctionDaoMapper;

    /**
     * 添加权限
     * @param record 权限数据
     * @return
     */
    @Override
    public int addLimit(LimitFunction record) {
        record.setCreationTime(new Date());
        return limitFunctionMapper.insertSelective(record);
    }

    @Override
    public int changeLimit(LimitFunction record) {
        return limitFunctionMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public List findParentLimit() {
        return limitFunctionDaoMapper.selectParentLimit();
    }

    @Override
    public LimitFunction getOneLimitFunction(Integer id) {
        return limitFunctionMapper.selectByPrimaryKey(id);
    }

    @Override
    public PageInfo findAllLimitFunction(Integer pageNum,Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<LimitFunctionVO> list = limitFunctionDaoMapper.selectAllLimitFunctionVO();
        PageInfo<LimitFunctionVO> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public Integer removeLimitFunction(Integer id) {
        return limitFunctionMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<LimitFunctionVO> getAllLimitFunction() {
        List<LimitFunctionVO> list = limitFunctionDaoMapper.selectParentLimit();
        for (int i = 0; i < list.size(); i++) {
            List<LimitFunction> limitFunctionsChild =
                    limitFunctionDaoMapper.selectChildLimitFunction(list.get(i).getLfId());
            list.get(i).setLimitFunctionsChild(limitFunctionsChild);
        }
        return list;
    }
}
