package com.zzf.east_project.service.imp;

import com.zzf.east_project.dao.IAccountDao;
import com.zzf.east_project.dao.Imp.IAccountDaoImp;
import com.zzf.east_project.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author 37587
 * @version 1.0
 * @date 2020/6/4 18:44
 * @description
 */
@Component("accountService")
public class IAccountImp implements IAccountService {

    @Autowired
    private IAccountDao iAccountDao;
    public void saveAccount() {
      iAccountDao.saveAccount();
    }
}
