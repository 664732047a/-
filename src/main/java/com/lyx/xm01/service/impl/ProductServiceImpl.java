package com.lyx.xm01.service.impl;

import com.lyx.xm01.bean.Product;
import com.lyx.xm01.bean.ProductExample;
import com.lyx.xm01.dao.ProductMapper;
import com.lyx.xm01.service.ProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Resource
    private ProductMapper productMapper;

    @Override
    public List<Product> findAll() {
        return productMapper.selectByExample(new ProductExample());
    }

    @Override
    public void saveOrUpdate(Product product) {
        if(product.getId() == null){
            productMapper.insertSelective(product);
        }else {
            productMapper.updateByPrimaryKey(product);
        }
    }

    @Override
    public void deleteById(Long id) {
        productMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Product findById(Long id) {
        return productMapper.selectByPrimaryKey(id);
    }
}
