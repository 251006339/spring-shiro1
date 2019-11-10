package com.hxm;

import com.hxm.entity.Student;
import com.hxm.entity.Week;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import groovy.transform.ASTTest;
import org.junit.Test;
import org.springframework.test.util.ReflectionTestUtils;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * @author XAIOHU
 * @date 2019/11/4 --14:47
 **/

public class MainTest {

    public static void main(String[] args) {


        Random random = new Random();
        //保留四位小数;
        DecimalFormat decimalFormat = new DecimalFormat("0.0000");

        String format = decimalFormat.format(random.nextDouble() * 3 + 10);
        Double aDouble = Double.valueOf(format);
        //保持精度
        BigDecimal bigDecimal = BigDecimal.valueOf(aDouble);

        System.out.println(bigDecimal);

        Week friday = Week.Friday;
        Integer day = friday.getDay();
        Integer work = friday.getWork();
        if (!day.equals(work)) {
            System.out.println("day" + day + "work" + work);
        }
        List<Integer> list=new ArrayList<>();
        list.add(3);
        list.add(22);
        list.add(41);
        list.add(18);
        list.add(9);

        Collections.sort(list);
        System.out.println(list);
        Student student = new Student();
        //通过反射给属性赋值;

        ReflectionTestUtils.setField(student,"name","s");
        System.out.println(student.getName());
    }
}
