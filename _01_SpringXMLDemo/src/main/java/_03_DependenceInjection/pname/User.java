package _03_DependenceInjection.pname;

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

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanPName.xml");
        User user = context.getBean("userPName", User.class);
        user.print();
        System.out.println(user.getName());
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }
}
