package com.zzf.east_project.service.imp;

import com.zzf.east_project.dao.IAccountDao;
import com.zzf.east_project.dao.Imp.IAccountDaoImp;
import com.zzf.east_project.factory.BeanFactory;
import com.zzf.east_project.service.IAccountService;

/**
 * @author 37587
 * @version 1.0
 * @date 2020/6/4 18:44
 * @description
 */
public class IAccountImp implements IAccountService {
    private IAccountDao iAccountDao= (IAccountDao) BeanFactory.getBean("accountDao");


    public void saveAccount() {
        iAccountDao.saveAccount();
    }
}
