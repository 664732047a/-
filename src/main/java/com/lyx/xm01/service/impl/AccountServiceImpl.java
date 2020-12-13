package com.lyx.xm01.service.impl;

import com.lyx.xm01.bean.Account;
import com.lyx.xm01.bean.AccountExample;
import com.lyx.xm01.dao.AccountMapper;
import com.lyx.xm01.service.AccountService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Resource
    private AccountMapper accountMapper;

    @Override
    public List<Account> findAll() {
        return accountMapper.selectByExample(new AccountExample());
    }

    @Override
    public void saveOrUpdate(Account account) {
        if(account.getId() == null){
            accountMapper.insertSelective(account);
        }else {
            accountMapper.updateByPrimaryKey(account);
        }
    }

    @Override
    public void deleteById(Long id) {
        accountMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Account findById(Long id) {
        return accountMapper.selectByPrimaryKey(id);
    }
}
