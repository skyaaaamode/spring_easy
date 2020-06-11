package com.zzf.east_project.dao.Imp;

import com.zzf.east_project.dao.IAccountDao;

/**
 * @author 37587
 * @version 1.0
 * @date 2020/6/4 18:46
 * @description
 */
public class IAccountDaoImp implements IAccountDao {
    private int savecount=0;
    public void saveAccount() {
        System.out.println("保存成功");
        System.out.println(savecount++);
    }
}
