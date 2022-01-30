package _03_DependenceInject.impl;

import _03_DependenceInject.PhoneDao;
import org.springframework.stereotype.Repository;

/**
 * @author Tptogiar
 * @description
 * @date 2022/1/3 - 21:06
 */
@Repository
public class PhoneDaoImpl implements PhoneDao {

    public void add(){
        System.out.println("PhoneDaoImpl add");
    }

}
