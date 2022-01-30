package _09_BeanLiftcycle;

/**
 * @author Tptogiar
 * @description 入门案例
 * @date 2022/1/2 - 15:18
 */

public class User {

    private String name;


    public User() {
        System.out.println("1.无参构造器");
    }

    public void setName(String name) {
        System.out.println("2.调用setter设置属性值");
        this.name = name;
    }

    public void initMethod(){
        System.out.println("3.执行初始化方法");
    }

    public void destoryMethod(){
        System.out.println("5.执行销毁方法");
    }
}
