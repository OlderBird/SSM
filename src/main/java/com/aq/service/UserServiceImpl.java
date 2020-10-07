package com.aq.service;

import com.aq.bean.User;
import com.aq.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> selectAll() {
        System.out.println("业务层查询所有账户");
        return userDao.selectAll();
    }

    @Override
    public void updateUser(int uid, User user) {
        System.out.println("业务层更新账户");
    }

    @Override
    public void insertUser(User user) {
        System.out.println("业务层插入账户");
        userDao.insertUser(user);
    }
}
