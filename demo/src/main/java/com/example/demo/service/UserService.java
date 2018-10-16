package com.example.demo.service;

import com.example.demo.po.User;

public interface UserService {

    User getUserByUserName(String userName);

    User getUserByUserId(int userId);
}
