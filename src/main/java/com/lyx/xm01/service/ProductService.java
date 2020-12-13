package com.lyx.xm01.service;

import com.lyx.xm01.bean.Product;



import java.util.List;

public interface ProductService {
    List<Product> findAll();

    void saveOrUpdate(Product product);

    void deleteById(Long id);

    Product findById(Long id);
}
