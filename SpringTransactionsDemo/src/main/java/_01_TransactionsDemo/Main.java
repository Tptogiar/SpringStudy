package _01_TransactionsDemo;

import _01_TransactionsDemo.service.impl.UserServiceImpl;
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
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("TransactionsDemo.xml");
        UserServiceImpl userService = context.getBean("userServiceImpl", UserServiceImpl.class);
        boolean transfer = userService.transfer(1, 2, 20);
        System.out.println(transfer);
    }




}
