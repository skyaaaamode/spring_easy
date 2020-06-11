package com.zzf.east_project.service.imp;

import com.zzf.east_project.dao.IAccountDao;
import com.zzf.east_project.dao.Imp.IAccountDaoImp;
import com.zzf.east_project.service.IAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 37587
 * @version 1.0
 * @date 2020/6/4 18:44
 * @description
 */
public class IAccountImp implements IAccountService {
    /**
     * 获取spring的ioc核心容器对象，并根据id获取对象
     */

    public IAccountImp(){
        System.out.println("IAcountImp创建了");
    }
    public void saveAccount() {
        ApplicationContext as= new ClassPathXmlApplicationContext("bean.xml");
        IAccountDao at=as.getBean("accountDao",IAccountDao.class);
       at.saveAccount();
    }
}
