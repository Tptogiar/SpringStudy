package _01_JDBCTemplateDemo.dao;

import _01_JDBCTemplateDemo.pojo.po.UserPO;

import java.util.List;

public interface UserDao {

    int addUser(UserPO userPo);

    int selectCount();

    UserPO selectOne(Integer id);

    List<UserPO> selectList();

    int[] batchAdd(List<Object[]> agrs);

}
