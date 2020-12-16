package com.hospital_purchase.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hospital_purchase.dao.DictionariesDao.DictionariesDaoMapper;
import com.hospital_purchase.dao.SupplierDao.SupplierMyMapper;
import com.hospital_purchase.pojo.Dictionaries;
import com.hospital_purchase.pojo.Supplier;
import com.hospital_purchase.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

@Service
@Resource
public class SupplierImpl implements SupplierService {
    @Autowired
    private SupplierMyMapper supplierMyMapper;

    @Autowired
    private DictionariesDaoMapper dictionariesDaoMapper;

    @Override
    public PageInfo<Supplier> fandAllSupplier(Integer pageNum, Integer pageSize, Supplier supplier) {
        PageHelper.startPage(pageNum,pageSize);
        List<Supplier> registraSupplier = supplierMyMapper.fandAllSupplier(supplier);
        PageInfo<Supplier> pageInfo = new PageInfo<Supplier>(registraSupplier);
        return pageInfo;
    }

    @Override
    public List itemsdiCtion() {
        return dictionariesDaoMapper.selectAllDictionaries(new Dictionaries());
    }

    @Override
    public Supplier fandspId(Integer spId) {
        return supplierMyMapper.fandOnespId(spId);
    }

    @Override
    public Integer revampsupplier(Supplier supplier) {
        System.out.println(supplier.getLicenceTime());
        return supplierMyMapper.revampsupplier(supplier);
    }
}
