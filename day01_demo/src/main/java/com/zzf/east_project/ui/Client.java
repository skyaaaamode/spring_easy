package com.zzf.east_project.ui;

import com.zzf.east_project.factory.BeanFactory;
import com.zzf.east_project.service.IAccountService;
import com.zzf.east_project.service.imp.IAccountImp;

/**
 * @author 37587
 * @version 1.0
 * @date 2020/6/4 18:48
 * @description
 */
public class Client {


    public static void main(String[] args) throws Exception {
//         IAccountService iAccountService=new IAccountImp();

        IAccountService iAccountService = (IAccountService)BeanFactory.getBean("accountService");
        iAccountService.saveAccount();
    }


}
