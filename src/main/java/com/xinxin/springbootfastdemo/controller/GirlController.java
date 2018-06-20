package com.xinxin.springbootfastdemo.controller;

import com.xinxin.springbootfastdemo.entity.Girl;
import com.xinxin.springbootfastdemo.respository.GirlRespository;
import org.hibernate.criterion.Example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GirlController {

    @Autowired
    private GirlRespository girlRespository;

    @GetMapping(value = "/girls")
    public List<Girl> girlList() {
        return girlRespository.findAll();
    }

    @PostMapping(value = "/girls")
    public Girl addGirl(@RequestParam("name")String name,
                        @RequestParam("age") Integer age) {
        Girl girl = new Girl();
        girl.setName(name);
        girl.setAge(age);
        return girlRespository.save(girl);
    }

    @GetMapping(value = "/girls/{id}")
    public Girl getGirl(@PathVariable("id") Integer id) {
        return girlRespository.getOne(id);
    }

    @PutMapping(value = "/girls/{id}")
    public Girl updateGirl(@PathVariable("id")Integer id,
                           @RequestParam("name")String name,
                           @RequestParam("age") Integer age) {
        Girl girl = new Girl();
        girl.setId(id);
        girl.setName(name);
        girl.setAge(age);
        return girlRespository.save(girl);
    }

    @DeleteMapping(value = "/girls/{id}")
    public void delGirl(@PathVariable("id") Integer id) {
        girlRespository.deleteById(id);
    }

    @GetMapping(value = "/girls/age/{age}")
    public List<Girl> girlListByAge(@PathVariable("age") Integer age) {
        return girlRespository.findByAge(age);
    }

}
