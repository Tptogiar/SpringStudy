package _02_test.noconstruction;

import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author Tptogiar
 * @description
 * @date 2022/1/2 - 16:42
 */
public class Main {

    public static void main(String[] args) {
        FileSystemXmlApplicationContext xml = new FileSystemXmlApplicationContext("C:\\MyFiles\\CodeFile\\Study\\JAVA\\Study\\SpringStudy\\Test\\Spring\\SpringInductionDemo\\src\\main\\resources\\bean.xml");
        UserNoneNoConstruction user = xml.getBean("userNoneNoConstruction", UserNoneNoConstruction.class);
        user.print();
    }




}
