package _07_FactoryBean;

import lombok.Data;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Tptogiar
 * @description 入门案例
 * @date 2022/1/2 - 15:18
 */
@Data
public class User {

    private String name;

    public void print(){
       System.out.println("inductiondemo.User.print()");
    }


}
