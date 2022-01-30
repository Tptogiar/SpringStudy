package _01_JDBCTemplateDemo;

import _01_JDBCTemplateDemo.pojo.po.UserPO;
import _01_JDBCTemplateDemo.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;

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

        System.out.println(userService.addUser(userPO));

        System.out.println(userService.selectCount());

        System.out.println(userService.selectOne(2));

        System.out.println(userService.selectList());
    }


    @Test
    public void testBacth(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("JDBCTemplateDemo.xml");
        UserServiceImpl userService = context.getBean("userService", UserServiceImpl.class);
        ArrayList<Object[]> objects = new ArrayList<Object[]>();
        objects.add(new Object[]{"name1",23});
        objects.add(new Object[]{"name2",123});
        objects.add(new Object[]{"nam3",1234});
        objects.add(new Object[]{"name4",1235});
        int[] ints = userService.batchAdd(objects);
        System.out.println(Arrays.toString(ints));


    }


}
