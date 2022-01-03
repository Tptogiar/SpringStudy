package _10_autowire;

/**
 * @author Tptogiar
 * @description
 * @date 2022/1/2 - 20:48
 */
public class User {

    private Phone phone;

    public User() {
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public Phone getPhone() {
        return phone;
    }
}
