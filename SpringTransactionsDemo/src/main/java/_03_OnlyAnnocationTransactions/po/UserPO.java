package _03_OnlyAnnocationTransactions.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @author Tptogiar
 * @description
 * @date 2022/1/5 - 10:48
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class UserPO {

    private int id;

    private String name;

    private int age;


}
