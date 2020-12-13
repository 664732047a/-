package com.lyx.xm01.service;

import com.lyx.xm01.bean.Account;



import java.util.List;

public interface AccountService {
    List<Account> findAll();

    void saveOrUpdate(Account account);

    void deleteById(Long id);

    Account findById(Long id);
}
