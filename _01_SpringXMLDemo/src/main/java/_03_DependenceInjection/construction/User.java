package _03_DependenceInjection.construction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Tptogiar
 * @description 入门案例
 * @date 2022/1/2 - 15:18
 */
public class User {

    private String name;


    public void print(){
       System.out.println("print()");
    }

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        User user = context.getBean("userConstructionIndex", User.class);
        user.print();
        System.out.println(user.name);
    }

}
