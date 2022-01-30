package _07_FactoryBean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author Tptogiar
 * @description
 * @date 2022/1/2 - 18:44
 */
public class MyFactoryBean implements FactoryBean<User> {
    public User getObject() throws Exception {
        User user = new User();
        user.setName("FactroyBean");
        return user;
    }

    public Class<?> getObjectType() {
        return null;
    }
}
