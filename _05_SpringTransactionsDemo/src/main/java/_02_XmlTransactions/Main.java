package _02_XmlTransactions;

import _02_XmlTransactions.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Tptogiar
 * @description
 * @date 2022/1/5 - 18:38
 */

public class Main {


    @Test
    public void testTransaction(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("XmlTransactions.xml");
        UserServiceImpl userService = context.getBean("userService", UserServiceImpl.class);
        boolean transfer = userService.transfer(1, 2, 20);
        System.out.println(transfer);
    }




}
