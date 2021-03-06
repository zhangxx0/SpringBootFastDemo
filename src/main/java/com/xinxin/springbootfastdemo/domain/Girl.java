package com.xinxin.springbootfastdemo.domain;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import java.io.Serializable;

@Entity
// 忽略序列化
@JsonIgnoreProperties(value={"hibernateLazyInitializer","handler","fieldHandler"})
public class Girl implements Serializable {

    @Id
    @GeneratedValue
    private int id;

    private String name;

    @Min(value = 18,message = "未成年禁止入内")
    private Integer age;

    public Girl() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
