package _04_OnlyAnnotationDev;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Tptogiar
 * @description
 * @date 2022/1/3 - 21:46
 */
public class Main {

    @Test
    public void testOnlyAnnotationDev(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        User user = context.getBean("user", User.class);
        System.out.println(user);


    }




}
