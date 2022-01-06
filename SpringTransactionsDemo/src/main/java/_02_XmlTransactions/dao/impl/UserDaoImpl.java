package _02_XmlTransactions.dao.impl;


import _02_XmlTransactions.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author Tptogiar
 * @description
 * @date 2022/1/4 - 19:04
 */

public class UserDaoImpl implements UserDao {

    @Autowired
    JdbcTemplate jdbcTemplate;


    public int addMoney(Integer id,Integer money) {
        String sql = "update user set money = money+? where id = ? ";
        return jdbcTemplate.update(sql,money,id);
    }

    public int cutMoney(Integer id,Integer money) {
        String sql = " update user set money = money-? where id = ? ";
        return jdbcTemplate.update(sql, money, id);
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
