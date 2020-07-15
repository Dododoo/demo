package com.boss.spring.service.impl;

import com.boss.spring.entity.User;
import com.boss.spring.service.UserService;

public class UserServiceImpl implements UserService {
    public void saveUser(User user) {
        System.out.println("success save user:" + user.getName());
    }
}
