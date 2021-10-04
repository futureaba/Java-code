package com.company;

public class Main {

    public static void main(String[] args) {
	//给定两个int变量，交换变量的值
        /*int a ,b, c;
        a = 15;
        b = 20;
        c = 0 ;//引入变量c
        c = a;
        a = b;
        b = c;
        System.out.println(a);
        System.out.println(b);*/
        //给定三个int变量，求其中的最大值和最小值
        int a , b , c ;
        a = 5;
        b = 10;
        c = 15;
        int maxnum = a;//假定一个数为最小值，为最大值
        int minnum =a;
        if(maxnum<b){//将剩下的两个数与其比较
           maxnum = b;
        }
        if(b<c){
           maxnum = c;
        }
        if(b<minnum){
           minnum = b;
        }
        if(c<b){
           minnum = c;
        }
        System.out.println("最大值="+maxnum+",最小值="+minnum);
        }
    }

