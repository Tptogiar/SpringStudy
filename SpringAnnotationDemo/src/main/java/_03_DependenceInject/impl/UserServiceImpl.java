package _03_DependenceInject.impl;

import _03_DependenceInject.PhoneDao;
import _03_DependenceInject.UserDao;
import _03_DependenceInject.UserService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.jws.WebResult;

/**
 * @author Tptogiar
 * @description
 * @date 2022/1/3 - 20:57
 */
@Service
@Data
public class UserServiceImpl implements UserService {

    @Autowired
    private PhoneDao phoneDao;

    @Resource//根据类型
//    @Resource(name = "phoneDaoImpl")//根据名称
    private PhoneDao phoneDaoResource;

    @Value("sdf")
    private String strValue;

    @Value("12")
    private int intValue;

    @Value("12.12")
    private double doubleValue;

    @Autowired
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
