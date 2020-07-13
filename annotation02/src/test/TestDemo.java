import com.zzf.example.config.Configration;
import com.zzf.example.domain.Account;
import com.zzf.example.service.AccountService;
import com.zzf.example.service.imp.AccountServiceImp;
import com.zzf.example.utils.PropertiesUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Configration.class)
public class TestDemo {
    @Autowired
    private AccountService ac;
@Test
public void test01(){
    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Configration.class);
    AccountService accountService = ac.getBean("accountService", AccountService.class);
    Account accountById = accountService.findAccountById(1);
    System.out.println(accountById);
}
@Test
public void test02(){
    Object password = PropertiesUtils.getByname(PropertiesUtils.class, "jdbc.properties", "password");
    System.out.println(password);
}

    /**
     * 怎么整合junit
     */
    @Test
    public void test03(){
        Account accountById = ac.findAccountById(1);
        System.out.println(accountById);
    }
}
