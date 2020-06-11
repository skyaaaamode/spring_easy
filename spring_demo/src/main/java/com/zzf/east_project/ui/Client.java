package com.zzf.east_project.ui;

import com.zzf.east_project.service.IAccountService;
import com.zzf.east_project.service.imp.IAccountImp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 37587
 * @version 1.0
 * @date 2020/6/4 18:48
 * @description
 */
public class Client {


    public static void main(String[] args) throws Exception {
        /**
         * 1.获取springioc核心容器对象
         */
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        /**
         * 2.根据id获取bean对象
         */
//        IAccountService accountService = (IAccountService)ac.getBean("accountService");
        IAccountService as = ac.getBean("accountService", IAccountService.class);
        as.saveAccount();
    }


}
