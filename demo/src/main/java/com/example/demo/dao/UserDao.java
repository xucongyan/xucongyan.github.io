package com.example.demo.dao;

import com.example.demo.po.User;

public interface UserDao {

    User getUserByUserName(String userName);

    User getUserByUserId(int userId);
}
