package com.sun.shixun.springboot_demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "Swagegr测试")
@RestController
public class SwaggerUITest {

 @GetMapping("/swagger")
 @ApiOperation(notes = "测试",value = "hello")
    public String swagger(){
     return "swagger";
 }
}
