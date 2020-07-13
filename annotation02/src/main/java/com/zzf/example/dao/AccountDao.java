package com.zzf.example.dao;

import com.zzf.example.domain.Account;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author 37587
 * @version 1.0
 * @date 2020/6/11 23:00
 * @description
 */

public interface AccountDao {
    List<Account> findAllAccount();

    Account findAccountById(Integer id);

    void saveAccount(Account account);

    void updateAccout(Account account);

    void deleteAccount(Integer id);
}
