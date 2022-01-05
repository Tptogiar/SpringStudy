package _01_TransactionsDemo.service.impl;

import _01_TransactionsDemo.dao.UserDao;
import _01_TransactionsDemo.dao.impl.UserDaoImpl;
import _01_TransactionsDemo.po.UserPO;
import _01_TransactionsDemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Tptogiar
 * @description
 * @date 2022/1/4 - 19:04
 */
@Service
@Transactional//加载类上，所有方法都起作用
public class UserServiceImpl implements UserService {

    @Autowired
    @Qualifier(value = "userDaoImpl")
    private UserDao userDao;


//    @Transactional//加方法上，只本方法都起作用
    public boolean transfer(Integer id1,Integer id2,Integer money) {
        try {
            userDao.cutMoney(id1,money);
            int a= 3/0;
            userDao.addMoney(id2,money);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
