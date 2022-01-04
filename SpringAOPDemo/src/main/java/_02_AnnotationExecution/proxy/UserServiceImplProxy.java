package _02_AnnotationExecution.proxy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author Tptogiar
 * @description
 * @date 2022/1/4 - 16:57
 */
@Component
@Aspect
public class UserServiceImplProxy {


    @Before(value = "execution(* _02_AnnotationExecution.impl.UserServiceImpl.add(..))")
    public void before() {
        System.out.println(" before() ");
    }


    @AfterReturning(value = "execution(* _02_AnnotationExecution.impl.UserServiceImpl.add(..))")
    public void afterReturning() {
        System.out.println(" afterReturning() ");
    }

    @After(value = "execution(* _02_AnnotationExecution.impl.UserServiceImpl.add(..))")
    public void after() {
        System.out.println(" after() ");
    }

    @AfterThrowing(value = "execution(* _02_AnnotationExecution.impl.UserServiceImpl.add(..))")
    public void afterThrowing() {
        System.out.println(" afterThrowing() ");
    }


    @Around(value = "execution(* _02_AnnotationExecution.impl.UserServiceImpl.add(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println(" around----before ");

        proceedingJoinPoint.proceed();

        System.out.println(" around----after ");
    }



}
