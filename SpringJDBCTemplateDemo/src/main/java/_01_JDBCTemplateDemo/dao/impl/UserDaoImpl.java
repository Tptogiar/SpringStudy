package _01_JDBCTemplateDemo.dao.impl;

import _01_JDBCTemplateDemo.dao.UserDao;
import _01_JDBCTemplateDemo.pojo.po.UserPO;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * @author Tptogiar
 * @description
 * @date 2022/1/4 - 19:04
 */
public class UserDaoImpl implements UserDao {

    JdbcTemplate jdbcTemplate;


    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    public int addUser(UserPO userPo) {
        String sql = " insert into user (name,age) values (?,?) ";
        // 增加，删除，修改等都可以用update
        return jdbcTemplate.update(sql, userPo.getName(), userPo.getAge());
    }

    public int selectCount() {
        String sql= "select count(*) from user";
        return jdbcTemplate.queryForObject(sql, Integer.class);
    }

    public UserPO selectOne(Integer id) {
        String sql="select * from user where id = ? ";
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<UserPO>(UserPO.class), id);
    }

    public List<UserPO> selectList() {
        String sql = "select * from user ";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<UserPO>(UserPO.class));
    }

    public int[] batchAdd(List<Object[]> agrs) {
        String sql = " insert into user (name,age) values( ? , ? ) ";
        return jdbcTemplate.batchUpdate(sql, agrs);
    }


}
