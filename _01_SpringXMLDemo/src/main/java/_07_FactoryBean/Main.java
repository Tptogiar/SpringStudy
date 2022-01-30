package _07_FactoryBean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Tptogiar
 * @description
 * @date 2022/1/2 - 18:52
 */
public class Main {


    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanFactoryBean.xml");
        User user = context.getBean("factoryBean", User.class);
        System.out.println(user.getName());


    }

}
