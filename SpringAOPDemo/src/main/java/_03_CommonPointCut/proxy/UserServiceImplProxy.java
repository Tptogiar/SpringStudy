package _03_CommonPointCut.proxy;

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

    @Pointcut(value = "execution(* _03_CommonPointCut.impl.UserServiceImpl.add(..))")
    public void pointCut(){

    }


    @Before(value = "pointCut()")
    public void before() {
        System.out.println(" before() ");
    }


    @AfterReturning(value = "pointCut()")
    public void afterReturning() {
        System.out.println(" afterReturning() ");
    }

    @After(value = "pointCut()")
    public void after() {
        System.out.println(" after() ");
    }

    @AfterThrowing(value = "pointCut()")
    public void afterThrowing() {
        System.out.println(" afterThrowing() ");
    }


    @Around(value = "pointCut()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println(" around----before ");

        proceedingJoinPoint.proceed();

        System.out.println(" around----after ");
    }



}
