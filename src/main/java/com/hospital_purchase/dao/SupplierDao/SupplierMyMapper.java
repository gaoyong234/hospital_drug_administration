package com.hospital_purchase.dao.SupplierDao;

import com.hospital_purchase.pojo.Supplier;

import java.util.List;

public interface SupplierMyMapper {

    List<Supplier> fandAllSupplier(Supplier supplier);
}