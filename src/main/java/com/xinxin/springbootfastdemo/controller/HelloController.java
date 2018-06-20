package com.xinxin.springbootfastdemo.controller;

import com.xinxin.springbootfastdemo.property.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @Autowired
    private GirlProperties girlProperties;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        return "Hello Spring Boot！" + girlProperties.getAge() + "岁的" + girlProperties.getName() + "!";
    }

    // @PathVariable
    @RequestMapping(value = "/hello2/{name}",method = RequestMethod.GET)
    public String hello2(@PathVariable("name") String name) {
        return "hello " + name + "!";
    }

    // 组合注解
    // @RequestParam
    @GetMapping(value = "/hello3")
    public String hello3(@RequestParam(value = "name",required = false, defaultValue = "xinxin") String name) {
        return "hello " + name;
    }

}
