package _01_JDBCTemplateDemo;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Tptogiar
 * @description
 * @date 2022/1/5 - 11:01
 */
public class TestDatabaseConnect {


    @Test
    public void testConnect() throws ClassNotFoundException, SQLException {

        Class<?> clazz = Class.forName("com.mysql.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/springstudy";
        String username="root";
        String password="tptogiar";
        Connection connection = DriverManager.getConnection(url, username, password);
        System.out.println(connection);


    }





}
