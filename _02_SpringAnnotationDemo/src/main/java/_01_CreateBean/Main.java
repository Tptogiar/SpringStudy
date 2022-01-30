package _01_CreateBean;


import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Tptogiar
 * @description
 * @date 2022/1/3 - 19:32
 */
public class Main {

    @Test
    public void testCreateBean(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("CreateBean.xml");
        User createBean = context.getBean("createBean", User.class);
        System.out.println(createBean);
    }




}

