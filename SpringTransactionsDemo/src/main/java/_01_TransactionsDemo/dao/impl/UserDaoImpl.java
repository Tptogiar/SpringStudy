package _01_TransactionsDemo.dao.impl;


import _01_TransactionsDemo.dao.UserDao;
import _01_TransactionsDemo.po.UserPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Tptogiar
 * @description
 * @date 2022/1/4 - 19:04
 */
@Repository
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
}
