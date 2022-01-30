package _08_BeanScope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Tptogiar
 * @description
 * @date 2022/1/2 - 19:21
 */
public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope.xml");
        User user1 = context.getBean("userScope", User.class);
        User user2 = context.getBean("userScope", User.class);
        System.out.println(user1);
        System.out.println(user2);

    }







}
