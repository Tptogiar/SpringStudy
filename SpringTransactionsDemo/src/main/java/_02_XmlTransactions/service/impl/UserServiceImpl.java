package _02_XmlTransactions.service.impl;

import _02_XmlTransactions.dao.UserDao;
import _02_XmlTransactions.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Tptogiar
 * @description
 * @date 2022/1/4 - 19:04
 */

public class UserServiceImpl implements UserService {

    private UserDao userDao;


//    @Transactional//加方法上，只本方法都起作用
    public boolean transfer(Integer id1,Integer id2,Integer money) {
        userDao.cutMoney(id1,money);
        int a= 3/0;
        userDao.addMoney(id2,money);
        return true;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
