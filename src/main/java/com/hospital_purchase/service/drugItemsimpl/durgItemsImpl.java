package com.hospital_purchase.service.drugItemsimpl;

import com.hospital_purchase.dao.DrugItemsMapper;
import com.hospital_purchase.pojo.DrugItems;
import com.hospital_purchase.service.DurgItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class durgItemsImpl implements DurgItemsService {
    @Autowired
    private DrugItemsMapper drugItemsMapper;

    @Override
    public List<DrugItems> inquireDurgItems() {
        List<DrugItems> drugItems = drugItemsMapper.selectAll();
        return drugItems;
    }
}
