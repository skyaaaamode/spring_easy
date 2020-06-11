package com.zzf.example.service.imp;

import com.zzf.example.dao.AccountDao;
import com.zzf.example.domain.Account;
import com.zzf.example.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author 37587
 * @version 1.0
 * @date 2020/6/11 22:59
 * @description
 */
public class AccountServiceImp implements AccountService {


    @Autowired
    private AccountDao accountDao;

    @Override
    public List<Account> findAllAccount() {
        return null;
    }

    @Override
    public List<Account> findAccountById(Integer id) {
        return null;
    }

    @Override
    public void saveAccount(Account account) {
        accountDao.saveAccount(account);

    }

    @Override
    public void updateAccout( Account account) {
accountDao.updateAccout(account);
    }

    @Override
    public void deleteAccount(Integer id) {
        accountDao.deleteAccount(id);

    }
}
