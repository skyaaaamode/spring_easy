package com.zzf.example.service;

import com.zzf.example.domain.Account;

import java.util.List;

/**
 * @author 37587
 * @version 1.0
 * @date 2020/6/11 22:57
 * @description
 */
public interface AccountService {
    List<Account> findAllAccount();

    List<Account> findAccountById(Integer id);

    void saveAccount(Account account);

    void updateAccout(Account account);

    void deleteAccount(Integer id);

}
