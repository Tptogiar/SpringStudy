package _02_XmlTransactions.po;

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
public class UserPO {

    private int id;

    private String name;

    private int age;


}
