package _01_TransactionsDemo.service;



import _01_TransactionsDemo.po.UserPO;

import java.util.List;

public interface UserService {

    boolean transfer(Integer id1,Integer id2,Integer money);

}
