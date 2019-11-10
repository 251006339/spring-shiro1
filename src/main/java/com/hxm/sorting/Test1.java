package com.hxm.sorting;

/*
   @Desrction: 冒泡排序
 */
public class Test1 {


    public static void main(String[] args) {
        test();
    }

    public static void test(){
        int [] a={5,3,6,7,5,8,2,6};
        int temp=0;
        int temp1=0;
        for (int i = 0; i <a.length ; i++) {

            for (int j = i; j <a.length-1 ; j++) {
                  temp=a[j];
                if(temp>a[j+1]){
                     temp =a[j+1];
                       a[j+1
                               ]=a[j];
                   }
                if (temp1>a[j]){
                    temp1=a[j];
                       a[j]=temp;

                }
             }
            a[i]=temp1;
     }



    }



}
