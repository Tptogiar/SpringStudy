package _08_BeanScope;

import lombok.Data;

/**
 * @author Tptogiar
 * @description 入门案例
 * @date 2022/1/2 - 15:18
 */

public class User {

    private String name;

    public void print(){
       System.out.println("inductiondemo.User.print()");
    }


}
