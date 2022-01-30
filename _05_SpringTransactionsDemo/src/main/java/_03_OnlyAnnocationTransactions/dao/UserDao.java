package _03_OnlyAnnocationTransactions.dao;


public interface UserDao {


    int addMoney(Integer id, Integer money);

    int cutMoney(Integer id, Integer money);

}
