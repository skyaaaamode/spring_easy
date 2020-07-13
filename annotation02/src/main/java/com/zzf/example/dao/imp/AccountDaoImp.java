package com.zzf.example.dao.imp;

import com.zzf.example.dao.AccountDao;
import com.zzf.example.domain.Account;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.SQLException;
import java.util.List;

/**
 * @author 37587
 * @version 1.0
 * @date 2020/6/11 23:00
 * @description
 */
@Component("accountDao")
public class AccountDaoImp implements AccountDao {


    @Autowired
    private QueryRunner queryRunner;
    @Override
    public List<Account> findAllAccount() {
        try {
           return queryRunner.query("select * from account",new BeanListHandler<Account>(Account.class));
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    @Override
    public Account findAccountById(Integer id) {
        try {
            return queryRunner.query("select * from account where id=?",new BeanHandler<Account>(Account.class),id);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    @Override
    public void saveAccount(Account account) {
        try {
             queryRunner.update("insert into account(name,money) values(?,?)", new BeanHandler<>(Account.class),account.getName(),account.getMoney());

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void updateAccout(Account account) {
        try {
            queryRunner.update("update  account set name=?,money=? where id=?",
                    account.getName(),account.getMoney(),account.getId());

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void deleteAccount(Integer id) {
        try {
            queryRunner.update("delete from  account where id=?",id
                   );

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void setRunner(QueryRunner runner) {
    }
}
