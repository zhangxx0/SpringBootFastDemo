package com.xinxin.springbootfastdemo.service;

import com.xinxin.springbootfastdemo.domain.Girl;
import com.xinxin.springbootfastdemo.respository.GirlRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GirlServiceTest {

    @Autowired
    private GirlService girlService;

    @Autowired
    private GirlRepository girlRepository;

    @Test
    @Transactional
    public void getOne() throws Exception {
        Integer id = 3;
        // 以下两种方式均会报以下的错误：org.hibernate.LazyInitializationException: could not initialize proxy [com.xinxin.springbootfastdemo.domain.Girl#3] - no Session
        Girl girl = girlService.getOne(id);
//        Girl girl = girlRepository.getOne(id);
        Assert.assertEquals(new Integer(66 ), girl.getAge());
    }

}