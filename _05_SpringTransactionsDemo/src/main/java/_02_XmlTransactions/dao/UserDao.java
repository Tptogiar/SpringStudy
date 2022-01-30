package _02_XmlTransactions.dao;


public interface UserDao {


    int addMoney(Integer id, Integer money);

    int cutMoney(Integer id, Integer money);

}
