package com.hospital_purchase.service;

import com.github.pagehelper.PageInfo;
import com.hospital_purchase.pojo.Supplier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SupplierService {

    PageInfo<Supplier> fandAllSupplier(Integer pageNum, Integer pageSize, Supplier supplier);

    List itemsdiCtion();

    Supplier fandspId(Integer spId);

    Integer revampsupplier(Supplier supplier);
}
