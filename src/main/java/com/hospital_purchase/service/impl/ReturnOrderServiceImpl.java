package com.hospital_purchase.service.impl;

import com.github.pagehelper.PageInfo;
import com.hospital_purchase.dao.QuitOrdersMapper;
import com.hospital_purchase.dao.ReturnOrder.ReturnOrderMapper;
import com.hospital_purchase.pojo.QuitOrders;
import com.hospital_purchase.service.ReturnOrderService;
import com.hospital_purchase.vo.ReturnOrderVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ReturnOrderServiceImpl implements ReturnOrderService {

    @Autowired
    private ReturnOrderMapper returnOrderMapper;

    @Autowired
    private QuitOrdersMapper quitOrdersMapper;

    @Override
    public PageInfo<ReturnOrderVO> findReturnOrderDrugInfo(Integer pageNum, Integer pageSize, ReturnOrderVO returnOrderVO) {
        List<ReturnOrderVO> list = returnOrderMapper.findReturnOrderDrugInfo(returnOrderVO);
        PageInfo<ReturnOrderVO> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public Integer addReturnOrder(QuitOrders quitOrders) {
        Date date = new Date();
        quitOrders.setFundTime(date);
        return quitOrdersMapper.insertSelective(quitOrders);
    }
}
