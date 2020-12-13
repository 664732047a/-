package com.lyx.xm01.web.controller;

import com.lyx.xm01.bean.Account;
import com.lyx.xm01.service.AccountService;
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
@RequestMapping("account")
@Api(description = "账户接口")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @GetMapping("findAll")
    @ApiOperation("查询所有")
    public Message findAll(){
        return MessageUtil.success(accountService.findAll());
    }

    @PostMapping("saveOrUpdate")
    @ApiOperation("添加或修改操作")
    public Message saveOrUpDate(Account account){
        accountService.saveOrUpdate(account);
        return MessageUtil.success("操作成功");
    }

    @GetMapping("deleteFindAll")
    @ApiOperation("删除一条数据操作")
    public Message deleteFindAll(Long id){
        accountService.deleteById(id);
        return MessageUtil.success("删除成功");
    }

    @GetMapping("findById")
    @ApiOperation("查询单条操作")
    public Message findById(Long id){
        return MessageUtil.success("查询单挑记录",accountService.findById(id));
    }
}
