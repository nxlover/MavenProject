package mybatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class Test2 {
    @Test
    public void Test() throws IOException {
        String resource="mybatis-config.xml";
        InputStream inputStream= Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession=sqlSessionFactory.openSession();
        String s="mybatis.AccountMapper";
        //添加
        Account account=new Account(null,"account1",500.0);
        sqlSession.insert(s+".insert",account);
        sqlSession.commit();
        //删除
        sqlSession.delete(".delete",account.getId());
        sqlSession.commit();
        /*
        //修改
        account.setBalance(600.0);
        sqlSession.update(".update",account);
        sqlSession.commit();
         */
        /*
        //查询
        Account account1=sqlSession.selectOne("selectAccountById",9);
        System.out.println(account1);
        */
        sqlSession.close();
    }
}
