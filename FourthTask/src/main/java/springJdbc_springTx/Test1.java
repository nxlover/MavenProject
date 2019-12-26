package springJdbc_springTx;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    @Test
    public void Test(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountDao accountDao=(AccountDao)applicationContext.getBean("accountDao");
        Account account1=new Account(null,"user1",500.0);
        Account account2=new Account(null,"user2",500.0);
        accountDao.addAccount(account1);
        accountDao.addAccount(account2);
        accountDao.transfer("user1","user2",100.0);
    }
}
