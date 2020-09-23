package com.sun.shixun.springboot_demo.service.serviceImpl;

import com.sun.shixun.springboot_demo.entity.User;
import com.sun.shixun.springboot_demo.mapper.UserDao;
import com.sun.shixun.springboot_demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.websocket.server.ServerEndpoint;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;


    @Override
    public User getUserById(Integer id) {
        return userDao.selectById(id);
    }
}
