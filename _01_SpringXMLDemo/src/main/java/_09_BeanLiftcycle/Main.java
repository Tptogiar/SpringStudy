package _09_BeanLiftcycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Tptogiar
 * @description
 * @date 2022/1/2 - 19:21
 */
public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLiftcycle.xml");
        User user = context.getBean("userLiftcycle", User.class);
        System.out.println("4.获取bean对象   "+user);
        context.close();


    }


    public static void beanLiftcycleNoPostHandle(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLiftcycle.xml");
        User user = context.getBean("userLiftcycle", User.class);
        System.out.println("4.获取bean对象   "+user);
        context.close();
    }




}
