package com.lyx.xm01.web.controller;

import com.lyx.xm01.bean.Product;
import com.lyx.xm01.service.ProductService;
import com.lyx.xm01.utils.Message;
import com.lyx.xm01.utils.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("product")
@Api(description = "产品接口")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("findAll")
    @ApiOperation("查询所有产品")
    public Message findAll(){
        return MessageUtil.success(productService.findAll());
    }

    @PostMapping("saveOrUpdate")
    @ApiOperation("增加或者修改操作")
    public Message saveOrUpdate(Product product){
        productService.saveOrUpdate(product);
        return MessageUtil.success("操作成功");
    }

    @GetMapping("deleteById")
    @ApiOperation("删除一条数据操作")
    public Message deleteById(Long id){
        productService.deleteById(id);
        return MessageUtil.success("删除成功");
    }

    @GetMapping("findById")
    @ApiOperation("查询一条数据操作")
    public Message findById(Long id){
        Product byId = productService.findById(id);
        return MessageUtil.success("查询出一条记录",byId);
    }

}
