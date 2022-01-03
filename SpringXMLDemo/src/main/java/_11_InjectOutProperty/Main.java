package _11_InjectOutProperty;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Tptogiar
 * @description
 * @date 2022/1/3 - 15:44
 */
public class Main {


    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanInjectOutProperty.xml");
        User user = context.getBean("userInjectOutProperty", User.class);
        String name = user.getName();
        System.out.println(name);

    }

}
