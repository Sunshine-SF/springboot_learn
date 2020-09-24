package com.sun.shixun.springboot_demo;

import com.sun.shixun.springboot_demo.entity.User;
import com.sun.shixun.springboot_demo.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.PriorityBlockingQueue;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringbootDemoApplicationTests {

    @Autowired
    private UserService userService;


    @Test
    void contextLoads() {
       User user =  userService.getUserById(1);
        System.out.println(user.getName());
    }

}
