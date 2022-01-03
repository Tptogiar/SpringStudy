package _03_DependenceInject;

import _03_DependenceInject.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Tptogiar
 * @description
 * @date 2022/1/3 - 21:01
 */
public class Main {


    @Test
    public void testAutowired(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("DependenceInject.xml");
        UserServiceImpl userService = context.getBean("userServiceImpl", UserServiceImpl.class);
        userService.phoneDaoAdd();
    }

    @Test
    public void testQualifier(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("DependenceInject.xml");
        UserServiceImpl userService = context.getBean("userServiceImpl", UserServiceImpl.class);
        userService.userDaoAdd();
    }





}
