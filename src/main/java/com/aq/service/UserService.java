package com.aq.service;

import com.aq.bean.User;

import java.util.List;

public interface UserService {
    /**查询所有账户*/
    public List<User> selectAll();

    /**修改指定账户信息*/
    public void updateUser(int uid, User user);

    /**添加账户信息*/
    public void insertUser(User user);
}
