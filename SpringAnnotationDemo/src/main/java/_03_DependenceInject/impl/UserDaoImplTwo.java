package _03_DependenceInject.impl;

import _03_DependenceInject.UserDao;
import org.springframework.stereotype.Repository;

/**
 * @author Tptogiar
 * @description
 * @date 2022/1/3 - 20:58
 */
@Repository
public class UserDaoImplTwo implements UserDao {


    public void add() {
        System.out.println(" UserDaoImplTwo ");
    }
}
