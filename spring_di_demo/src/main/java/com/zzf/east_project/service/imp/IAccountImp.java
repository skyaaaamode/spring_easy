package com.zzf.east_project.service.imp;

import com.zzf.east_project.dao.IAccountDao;
import com.zzf.east_project.dao.Imp.IAccountDaoImp;
import com.zzf.east_project.service.IAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

/**
 * @author 37587
 * @version 1.0
 * @date 2020/6/4 18:44
 * @description
 */
public class IAccountImp implements IAccountService {

    private String name;
    private Integer age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    private Date date;


//    public IAccountImp(String name,Integer age,Date date){
//        this.name=name;
//        this.age=age;
//        this.date=date;
//    }


    public void saveAccount() {
        ApplicationContext as= new ClassPathXmlApplicationContext("bean.xml");
        IAccountDao at=as.getBean("accountDao",IAccountDao.class);
       at.saveAccount();
    }
}
