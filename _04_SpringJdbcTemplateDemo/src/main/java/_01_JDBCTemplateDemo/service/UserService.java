package _01_JDBCTemplateDemo.service;

import _01_JDBCTemplateDemo.pojo.po.UserPO;

import java.util.List;

public interface UserService {

    int addUser(UserPO userPO);

    int selectCount();

    UserPO selectOne(Integer id);

    List<UserPO> selectList();


    int[] batchAdd(List<Object[]> args);

}
