package _01_JDBCTemplateDemo.service.impl;

import _01_JDBCTemplateDemo.dao.UserDao;
import _01_JDBCTemplateDemo.dao.impl.UserDaoImpl;
import _01_JDBCTemplateDemo.pojo.po.UserPO;
import _01_JDBCTemplateDemo.service.UserService;

import java.util.List;

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

    public int selectCount() {
        return userDao.selectCount();
    }

    public UserPO selectOne(Integer id) {
        return userDao.selectOne(id);
    }

    public List<UserPO> selectList() {
        return userDao.selectList();
    }

    public int[] batchAdd(List<Object[]> agrs) {
        return userDao.batchAdd(agrs);
    }

    public void setUserDao(UserDaoImpl userDao) {
        this.userDao=userDao;
    }
}
