package com.lyx.xm01.service.impl;

import com.lyx.xm01.bean.User;
import com.lyx.xm01.bean.UserExample;
import com.lyx.xm01.dao.UserMapper;
import com.lyx.xm01.service.UserService;
import com.lyx.xm01.utils.CustomerException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.selectByExample(new UserExample());
    }

    @Override
    public void saveOrUpdate(User user) {
        if(user.getId() == null){
            userMapper.insertSelective(user);
        }else {
            userMapper.updateByPrimaryKey(user);
        }
    }

    @Override
    public void deleteById(Long id){
        User userWithBLOBs = new User();
        if(userWithBLOBs.getId() == null){
            throw new CustomerException("id不能为空!");
        }else {
            userMapper.deleteByPrimaryKey(id);
        }
    }

    @Override
    public User findById(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
