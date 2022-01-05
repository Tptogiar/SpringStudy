package _01_JDBCTemplateDemo.service.impl;

import _01_JDBCTemplateDemo.dao.UserDao;
import _01_JDBCTemplateDemo.dao.impl.UserDaoImpl;
import _01_JDBCTemplateDemo.pojo.po.UserPO;
import _01_JDBCTemplateDemo.service.UserService;

/**
 * @author Tptogiar
 * @description
 * @date 2022/1/4 - 19:04
 */
public class UserServiceImpl implements UserService {



    private UserDao userDao;

    public int addUser(UserPO userPO) {
        return userDao.addUser(userPO);
    }

    public void setUserDao(UserDaoImpl userDao) {
        this.userDao=userDao;
    }
}
