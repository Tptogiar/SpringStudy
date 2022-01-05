package _01_TransactionsDemo.dao;


import _01_TransactionsDemo.po.UserPO;

import java.util.List;

public interface UserDao {


    int addMoney(Integer id,Integer money);

    int cutMoney(Integer id,Integer money);

}
