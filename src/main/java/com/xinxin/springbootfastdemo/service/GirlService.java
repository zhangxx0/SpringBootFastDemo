package com.xinxin.springbootfastdemo.service;

import com.xinxin.springbootfastdemo.domain.Girl;
import com.xinxin.springbootfastdemo.enums.ResultEnum;
import com.xinxin.springbootfastdemo.exception.GirlException;
import com.xinxin.springbootfastdemo.respository.GirlRepository;
import org.hibernate.criterion.Example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class GirlService {

    @Autowired
    private GirlRepository girlRepository;

    public void getAge(Integer id) throws Exception{
        Girl girl = girlRepository.getOne(id);
        Integer age = girl.getAge();
        if (age < 10) {
            throw new GirlException(ResultEnum.PRIMARY_SCHOOL);
        } else if(age >= 10 && age <= 15) {
            throw new GirlException(ResultEnum.MIDDLE_SCHOOL);
        }

        // 后续操作---
    }

    // test
    public Girl getOne(Integer id) {
//        return girlRepository.findByAge(66).get(0);
        return girlRepository.getOne(5);
    }
}
