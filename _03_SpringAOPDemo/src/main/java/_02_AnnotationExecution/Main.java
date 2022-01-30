package _02_AnnotationExecution;


import _02_AnnotationExecution.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContextExtensionsKt;

/**
 * @author Tptogiar
 * @description
 * @date 2022/1/4 - 16:54
 */
public class Main {

    @Test
    public void testAnnotationExecution(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserServiceImpl userServiceImpl = context.getBean("userServiceImpl", UserServiceImpl.class);
        userServiceImpl.add();
    }


}
