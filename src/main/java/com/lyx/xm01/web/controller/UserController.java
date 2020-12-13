package com.lyx.xm01.web.controller;

import com.lyx.xm01.bean.User;
import com.lyx.xm01.service.UserService;
import com.lyx.xm01.utils.Message;
import com.lyx.xm01.utils.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")
@Api(description = "用户接口")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("findAll")
    @ApiOperation("查询所有操作")
    public Message findAll(){
        List<User> all = userService.findAll();
        return MessageUtil.success(all);
    }

    @PostMapping("saveOrUpdate")
    @ApiOperation("增加或修改操作")
    public Message saveOrUpdate(User user){
        userService.saveOrUpdate(user);
        return MessageUtil.success("操作成功");
    }

    @GetMapping("deleteById")
    @ApiOperation("删除一条数据操作")
    public Message deleteById(Long id){
        userService.deleteById(id);
        return MessageUtil.success("删除成功");
    }

    @GetMapping("findById")
    @ApiOperation("查询一条数据操作")
    public Message findById(Long id){
        return MessageUtil.success(userService.findById(id));
    }
}
