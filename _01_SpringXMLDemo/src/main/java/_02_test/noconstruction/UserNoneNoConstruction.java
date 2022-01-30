package _02_test.noconstruction;

/**
 * @author Tptogiar
 * @description 测试不提供无参构造器
 * @date 2022/1/2 - 16:41
 */
public class UserNoneNoConstruction {

    private String name;

    public void print(){
        System.out.println("inductiondemo.User.print()");
    }

    public UserNoneNoConstruction(String name) {
    }
}
