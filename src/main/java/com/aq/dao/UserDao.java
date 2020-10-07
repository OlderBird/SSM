package com.aq.dao;

import com.aq.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("UserDao")
@Mapper
public interface UserDao {
    /**查询所有账户*/
    public List<User> selectAll();

    /**修改指定账户信息*/
    public void updateUser(int uid, User user);

    /**添加账户信息*/
    public void insertUser(User user);
}
