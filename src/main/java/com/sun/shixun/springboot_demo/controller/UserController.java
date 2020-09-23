package com.sun.shixun.springboot_demo.controller;

import com.sun.shixun.springboot_demo.entity.User;
import com.sun.shixun.springboot_demo.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "用户操作",tags = "用户操作")//修饰类
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "根据ID查询User的信息",notes = "参数传入注意事项",httpMethod = "GET")
    @GetMapping("/getUser/{id}")
    public User getUser(@PathVariable("id") Integer id){
        User user = userService.getUserById(id);
        return user;
    }


}
