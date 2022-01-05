package _01_JDBCTemplateDemo.dao.impl;

import _01_JDBCTemplateDemo.dao.UserDao;
import _01_JDBCTemplateDemo.pojo.po.UserPO;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author Tptogiar
 * @description
 * @date 2022/1/4 - 19:04
 */
public class UserDaoImpl implements UserDao {

    JdbcTemplate jdbcTemplate;


    public int addUser(UserPO userPo) {
        String sql = " insert into user (name,age) values (?,?) ";

        int update = jdbcTemplate.update(sql, userPo.getName(), userPo.getAge());

        return update;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
