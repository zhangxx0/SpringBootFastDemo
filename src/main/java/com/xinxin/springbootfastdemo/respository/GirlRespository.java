package com.xinxin.springbootfastdemo.respository;


import com.xinxin.springbootfastdemo.entity.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GirlRespository extends JpaRepository<Girl, Integer> {

    public List<Girl> findByAge(Integer age);
}
