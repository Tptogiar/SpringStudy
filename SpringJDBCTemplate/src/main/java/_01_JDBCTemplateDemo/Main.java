package _01_JDBCTemplateDemo;

import _01_JDBCTemplateDemo.pojo.po.UserPO;
import _01_JDBCTemplateDemo.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Tptogiar
 * @description
 * @date 2022/1/4 - 19:03
 */
public class Main {


    @Test
    public void testJDBCTemplate(){
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("JDBCTemplateDemo.xml");
        UserServiceImpl userService = context.getBean("userService", UserServiceImpl.class);
        UserPO userPO = new UserPO(5, "name", 66);
        int result = userService.addUser(userPO);
        System.out.println(result);
    }

}
