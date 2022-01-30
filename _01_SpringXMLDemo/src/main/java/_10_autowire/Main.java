package _10_autowire;


import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Tptogiar
 * @description
 * @date 2022/1/2 - 20:50
 */
public class Main {


    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanAutowire.xml");
        User user = context.getBean("userAutowire", User.class);
        System.out.println(user.getPhone().getPrice());
    }







}
