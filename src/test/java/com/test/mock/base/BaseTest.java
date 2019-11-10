package com.test.mock.base;

import com.alibaba.druid.support.json.JSONUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.hxm.entity.Person;
import com.hxm.entity.Student;
import org.junit.Test;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * @author XAIOHU
 * @date 2019/11/5 --13:10
 **/
//注册这个bean

public class BaseTest {

  @Test
    public void test(){
      Person person = new Person();
      //person.setName("DASA");
      Student student = new Student();
      student.setAge("11");
      person.setList(Arrays.asList(student));
      String s = JSONObject.toJSONString(person);
      System.out.println(s);


  }
    @Test
    public void test1(){
        Person person = new Person();
        person.setList(Arrays.asList(new Student("xiaohu","16")));

        String s = JSONObject.toJSONString(person);
        System.out.println(s);
        JSONObject jsonObject = JSON.parseObject(s);
        List<Student>maps = jsonObject.getObject("listA", List.class);

        System.out.println(maps);

        System.out.println(jsonObject);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);



    }





}
