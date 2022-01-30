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


    @Test
    public void testResource(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("DependenceInject.xml");
        UserServiceImpl userService = context.getBean("userServiceImpl", UserServiceImpl.class);
        userService.getPhoneDaoResource().add();
    }

    @Test
    public void testValue(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("DependenceInject.xml");
        UserServiceImpl userService = context.getBean("userServiceImpl", UserServiceImpl.class);
        System.out.println(userService.getStrValue());
        System.out.println(userService.getIntValue());
        System.out.println(userService.getDoubleValue());
    }



}
