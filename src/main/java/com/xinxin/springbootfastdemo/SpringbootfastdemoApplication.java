package com.xinxin.springbootfastdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

/**
 * Spring Boot 快速学习demo
 *
 * @Author zhang.xx
 * @date 2018年6月20日
 */
@SpringBootApplication
//@EnableAutoConfiguration
public class SpringbootfastdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootfastdemoApplication.class, args);
    }
}
