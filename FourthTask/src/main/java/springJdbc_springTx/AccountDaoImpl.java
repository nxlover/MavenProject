package springJdbc_springTx;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class AccountDaoImpl implements AccountDao{
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int addAccount(Account account) {
        String sql="insert into account(username,balance) value(?,?)";
        Object[] objects=new Object[]{account.getUsername(),account.getBalance()};
        int num=this.jdbcTemplate.update(sql,objects);
        return num;
    }

    @Override
    public int updateAccount(Account account) {
        String sql="update account set username=?,balance=? where id=?";
        Object[] objects=new Object[]{account.getUsername(),account.getBalance(),account.getId()};
        int num=this.jdbcTemplate.update(sql,objects);
        return num;
    }

    @Override
    public int deleteAccount(int id) {
        String sql="delete from account where id=?";
        int num=this.jdbcTemplate.update(sql,id);
        return num;
    }
@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,readOnly = false)
    @Override
    public void transfer(String outUser, String inUser, Double money) {
        this.jdbcTemplate.update("update account set balance=balance+?"+"where username=?",money,inUser);
        this.jdbcTemplate.update("update account set balance=balance-?"+"where username=?",money,outUser);
    }

}
