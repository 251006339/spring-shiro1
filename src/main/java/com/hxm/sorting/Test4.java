package com.hxm.sorting;

/**
 * @author XAIOHU
 * @date 2019/11/8 --19:02
 *   归并排序
 **/
public class Test4 {


    public static void main(String[] args) {
      test();

    }

    public static void test(){
    //    int [] a={54,56,2,86,2,798,34,9,23,0,3,873,7};
        int [] a1={5,4,7,3,9,3,4};
          int t=a1.length/2;
           if(a1.length%2==1){
               t=a1.length/2+1;
               ;
           }else {
               t=a1.length/2;
           }


           int [] [] a2={{},{},{}};
            int [] [] a3=new int[t][2];

           int h=0;
        for (int i = 0; i <t ; i++) {
            for (int j = 0; j <2 ; j++) {
                if(h==a1.length){
                    break;
                }
                a3[i][j]=a1[h];
                       h++;
                for (int k = 0; k <a3[i].length ; k++) {


                }
            }


        }






    }

}
