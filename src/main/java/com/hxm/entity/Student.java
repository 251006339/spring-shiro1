package com.hxm.entity;

import com.alibaba.fastjson.annotation.JSONField;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author XAIOHU
 * @date 2019/11/3 --11:35
 **/
//和EnaleConfigurationProperties结合使用;---和@Compent 一样注册到bean中;


public class Student {
    @JSONField(name = "name1")
  private String name;
    @JSONField(name = "age1")
  private String age;

    public Student() {
    }

    public Student(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }


}
