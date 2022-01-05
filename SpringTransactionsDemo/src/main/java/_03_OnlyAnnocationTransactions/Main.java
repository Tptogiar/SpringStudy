package _03_OnlyAnnocationTransactions;

import _03_OnlyAnnocationTransactions.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Tptogiar
 * @description
 * @date 2022/1/5 - 18:38
 */

public class Main {


    @Test
    public void testTransaction(){
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("TransactionsDemo.xml");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringTransactionsConfig.class);
        UserServiceImpl userService = context.getBean("userServiceImpl", UserServiceImpl.class);
        boolean transfer = userService.transfer(1, 2, 20);
        System.out.println(transfer);
    }




}
