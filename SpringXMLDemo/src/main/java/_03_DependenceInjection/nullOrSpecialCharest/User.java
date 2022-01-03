package _03_DependenceInjection.nullOrSpecialCharest;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Tptogiar
 * @description 入门案例
 * @date 2022/1/2 - 15:18
 */
public class User {

    private String name = "sdf";
    private String address;


    public void print(){
       System.out.println("print()");
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        User user = context.getBean("userNullOrSpecialCharest", User.class);
        user.print();
        System.out.println(user.getName());
        System.out.println(user.getAddress());
    }


}
