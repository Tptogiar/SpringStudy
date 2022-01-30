package _01_JDBCTemplateDemo.pojo.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
