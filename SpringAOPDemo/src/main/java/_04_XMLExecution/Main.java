package _04_XMLExecution;

import _04_XMLExecution.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Tptogiar
 * @description
 * @date 2022/1/4 - 18:08
 */
public class Main {


    @Test
    public void testXMLExecution(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("XMLExecution.xml");
        UserServiceImpl userServiceImpl = context.getBean("userServiceImpl", UserServiceImpl.class);
        userServiceImpl.add();
    }


}
