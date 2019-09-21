package com.xiangbo.service.impl;

import com.xiangbo.dao.IProductDao;
import com.xiangbo.domain.Product;
import com.xiangbo.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    private IProductDao productDao;

    @Override
    public List<Product> findAll() throws Exception {
        return productDao.findAll();
    }



}
