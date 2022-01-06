package _03_OnlyAnnocationTransactions.service.impl;

import _03_OnlyAnnocationTransactions.dao.UserDao;
import _03_OnlyAnnocationTransactions.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Tptogiar
 * @description
 * @date 2022/1/4 - 19:04
 */
@Service
@Transactional//加载类上，所有方法都起作用
public class UserServiceImpl implements UserService{

    @Autowired
    @Qualifier(value = "userDaoImpl")
    private UserDao userDao;


    @Transactional//加方法上，只本方法都起作用
    public boolean transfer(Integer id1,Integer id2,Integer money) {
        userDao.cutMoney(id1,money);
        int a= 3/0;
        userDao.addMoney(id2,money);
        return true;
    }
}
