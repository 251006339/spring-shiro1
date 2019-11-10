package com.hxm.sorting;

import com.hxm.entity.Person;
import com.hxm.eunm.PersonEnum;
import com.hxm.eunm.StudentEnum;

/**
 * @author XAIOHU
 * @date 2019/11/7 --21:35
 * 插入排序 : 循环:循环到的元素和前一个元素比较,
 **/
public class Test3 {

    public static void main(String[] args) {
 int [] a={4,567,243,76,21,78,33,96,234,7,3,49,75,2,9,23,89};
        int[] test = test(a);
        for (int i = 0; i <test.length ; i++) {
            System.out.println(test[i]);
        }


    }

    public static int []  test(int []a) {


        for (int i = 1; i < a.length-1; i++) {//A指针
            if (a[i] > a[i + 1]) {
                int temp = a[i + 1];
                a[i + 1] = a[i];
                a[i] = temp;
                         int j =i;
                while (j!=0&&a[j] < a[j - 1]) {
                    temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                     j--;
                }

            }

        }
  return a;

    }
    public static int[] rall(int []a){


        return  a;
    }

    public static int getInt() {

        return 1;
    }


}
