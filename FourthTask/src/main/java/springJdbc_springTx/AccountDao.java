package springJdbc_springTx;

public interface AccountDao {
    int addAccount(Account account);
    int updateAccount(Account account);
    int deleteAccount(int id);
    void transfer(String outUser,String inUser,Double money);
}
