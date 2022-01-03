package _02_Filter;

import org.junit.Test;
import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

/**
 * @author Tptogiar
 * @description
 * @date 2022/1/3 - 20:17
 */
public class Main {

    @Test
    public void testIncludeFilter(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Filter.xml");

        try {
            ComponentClass bean = context.getBean("componentClass", ComponentClass.class);
            System.out.println(bean);
        } catch (BeansException e) {
            e.printStackTrace();
        }
        System.out.println("----------------");
        try {
            ServiceClass serviceClass = context.getBean("serviceClass", ServiceClass.class);
            System.out.println(serviceClass);
        } catch (BeansException e) {
            e.printStackTrace();
        }
        System.out.println("----------------");
        try {
            RepositoryClass repositoryClass = context.getBean("repositoryClass", RepositoryClass.class);
            System.out.println(repositoryClass);
        } catch (BeansException e) {
            e.printStackTrace();
        }
        System.out.println("----------------");
        try {
            ControllerClass controllerClass = context.getBean("controllerClass", ControllerClass.class);
            System.out.println(controllerClass);
        } catch (BeansException e) {
            e.printStackTrace();
        }
    }



}
