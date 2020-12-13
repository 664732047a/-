package com.lyx.xm01.service;

import com.lyx.xm01.bean.User;


import java.util.List;

public interface UserService{
    List<User> findAll();

    void saveOrUpdate(User user);

    void deleteById(Long id);

    User findById(Long id);
}
