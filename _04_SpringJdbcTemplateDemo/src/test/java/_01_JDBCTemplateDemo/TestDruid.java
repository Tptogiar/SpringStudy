package _01_JDBCTemplateDemo;

//import com.alibaba.druid.pool.DruidDataSource;
//import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.apache.commons.dbcp.BasicDataSource;
import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author Tptogiar
 * @description
 * @date 2022/1/5 - 11:11
 */
public class TestDruid {
    @Test
    public void testDruid() throws SQLException {
        BasicDataSource source = new BasicDataSource();
        source.setDriverClassName( "com.mysql.jdbc.Driver" );
        source.setUrl( "jdbc:mysql:///springstudy" );
        source.setUsername( "root" );
        source.setPassword( "tptogiar" );
        Connection conn = source.getConnection();
        System.out.println(conn.isClosed());
    }
}
