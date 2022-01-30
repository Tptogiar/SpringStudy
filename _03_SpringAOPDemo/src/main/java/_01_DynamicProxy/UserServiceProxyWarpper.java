package _01_DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author Tptogiar
 * @description
 * @date 2022/1/3 - 23:05
 */
public class UserServiceProxyWarpper implements InvocationHandler {

    private Object target;

    private UserServiceProxyWarpper(Object target){
        this.target=target;
    }

    public static UserServiceProxyWarpper getWarapper(Object target){
        return new UserServiceProxyWarpper(target);
    }

    public Object invoke(Object target, Method method, Object[] args) throws Throwable {
        try {
            System.out.print("(proxy pre)");
            method.invoke(this.target,args);
            System.out.println("(proxy post)");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        return null;
    }
}
