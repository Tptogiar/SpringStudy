package _03_DependenceInject.impl;

import _03_DependenceInject.PhoneDao;
import _03_DependenceInject.UserDao;
import _03_DependenceInject.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @author Tptogiar
 * @description
 * @date 2022/1/3 - 20:57
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private PhoneDao phoneDao;

    @Qualifier(value = "userDaoImplTwo")
    private UserDao userDao;

    public void phoneDaoAdd() {
        System.out.print("phoneDaoAdd add........");
        phoneDao.add();
    }

    public void userDaoAdd() {
        System.out.print("userDaoAdd add........");
        userDao.add();
    }

}
