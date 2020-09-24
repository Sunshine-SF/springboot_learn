package com.sun.shixun.springboot_demo.controller;

import com.sun.shixun.springboot_demo.entity.User;
import com.sun.shixun.springboot_demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class ThymeleafController {

    @Autowired
    private UserService userService;

    @GetMapping("/thymeleaf/{id}")
    public String getUser(@PathVariable("id") Integer id, HttpServletRequest request){
        User user = userService.getUserById(id);
        request.setAttribute("user",user);
        return "index";
    }

    @GetMapping("/test/test")
    public ModelAndView getUser1(){
        User user = userService.getUserById(1);
        ModelAndView modelAndView = new ModelAndView("index.html");
        modelAndView.addObject("user",user);
        return modelAndView;
    }
}
