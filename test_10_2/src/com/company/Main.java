package com.company;

public class Main {

    public static void main(String[] args) {
        /*int a,b,z;//给定两个int变量，交换变量的值
         a =15;//引入z变量
         b =30;
         z=a;
         a=b;
         b=z;
        System.out.println (a);
        System.out.println(b);*/
        int a, b, c;//给定三个int变量，求最大值和最小值
        a = 10;
        b = 15;
        c = 20;
        int maxnum=a;//假定最大值和最小值是同一个值
        int minnum=a;
      if(maxnum<b){//分别将剩下的两个数的值和最大值比较
          maxnum=b;
      }
      if(b<c){
        maxnum=c;
      }
      if(minnum>b){//分别将剩下的两个数的值和最小值比较
          minnum=b;
      }
      if(b>c){
          minnum=c;
      }
      System.out.println("最大值="+maxnum+",最小值="+minnum);//输出最大值和最小值
    }
}
