package com.boss.spring.service;

import com.boss.spring.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    void saveUser(User user);
}
