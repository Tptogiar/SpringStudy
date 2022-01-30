package _01_CreateBean;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @author Tptogiar
 * @description
 * @date 2022/1/3 - 19:31
 */
@Data
@NoArgsConstructor
@Component(value = "createBean")
public class User {

    private String name="createBean";








}
