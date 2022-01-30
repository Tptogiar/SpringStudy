package _11_InjectOutProperty;

import _10_autowire.Phone;
import lombok.Data;

/**
 * @author Tptogiar
 * @description
 * @date 2022/1/2 - 20:48
 */
@Data
public class User {

    private String name;

    private Phone phone;

    public User() {
    }



}
