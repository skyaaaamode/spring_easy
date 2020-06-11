package com.zzf.east_project.dao.Imp;

import com.zzf.east_project.dao.IAccountDao;
import org.springframework.stereotype.Component;

/**
 * @author 37587
 * @version 1.0
 * @date 2020/6/4 18:46
 * @description
 */
@Component("accountDao")
public class IAccountDaoImp implements IAccountDao {
    public void saveAccount() {
        System.out.println("保存成功");
    }
}
