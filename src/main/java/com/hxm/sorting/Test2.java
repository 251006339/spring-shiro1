package com.hxm.sorting;

/**
 * @author XAIOHU
 * @date 2019/11/7 --20:36
 *@descrt:   选择排序:每次选出最小的一个元素;
 **/
public class Test2 {

    public static void main(String[] args) {
        int [] a={23,4,7,3,6,4,8,2,5};
        test(a);
        for (int i = 0; i <a.length ; i++) {
            System.out.println(a[i]);
        }




    }

    public static void test(int ... a ){
//每次确定一个最小的数
        for (int i = 0; i <a.length ; i++) {
            System.out.println("aaaaaaaaa");
            for (int j = i+1; j < a.length; j++) {
          if (a[i]>a[j]){
                 int temp =a[j];
                    a[j]=a[i];
                    a[i]= temp;


          }

            }


        }



    }
}
