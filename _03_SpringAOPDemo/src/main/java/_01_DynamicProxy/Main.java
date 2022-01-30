package _01_DynamicProxy;

import org.junit.Test;

import java.lang.reflect.Proxy;

/**
 * @author Tptogiar
 * @description
 * @date 2022/1/3 - 23:08
 */
public class Main {




    @Test
    public void testDynamicProxy() throws IllegalAccessException, InstantiationException {
        UserServiceImpl userService = new UserServiceImpl();
        ClassLoader classLoader = UserServiceImpl.class.getClassLoader();
        Class<?>[] interfaces = UserServiceImpl.class.getInterfaces();
        UserServiceProxyWarpper warapper = UserServiceProxyWarpper.getWarapper(userService);
        //报错：java.lang.ClassCastException: com.sun.proxy.$Proxy4 cannot be cast to _01_DynamicProxy.UserServiceImpl
//        UserServiceImpl userServiceProxy = (UserServiceImpl) Proxy.newProxyInstance(classLoader, interfaces, warapper);
        UserService userServiceProxy = (UserService) Proxy.newProxyInstance(classLoader, interfaces, warapper);
        userServiceProxy.add();
    }




}
