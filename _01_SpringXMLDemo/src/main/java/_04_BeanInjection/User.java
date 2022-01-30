package _04_BeanInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Tptogiar
 * @description 入门案例
 * @date 2022/1/2 - 15:18
 */
public class User {

    private String name = "sdf";
    private Phone phone;

    public void print(){
       System.out.println("print()");
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanInject.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user.getPhone().getPrice());
    }


}
