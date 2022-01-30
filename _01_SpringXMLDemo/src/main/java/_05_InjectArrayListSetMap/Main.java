package _05_InjectArrayListSetMap;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

/**
 * @author Tptogiar
 * @description
 * @date 2022/1/2 - 18:10
 */
public class Main {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanArrayListSetMap.xml");
        Student student = context.getBean("injectArrayListSetMap", Student.class);
        System.out.println(Arrays.toString(student.getArray()));
        System.out.println(Arrays.toString(student.getList().toArray()));
        System.out.println(Arrays.toString(student.getSet().toArray()));
        System.out.println(Arrays.toString(student.getMap().entrySet().toArray()));


    }


}
