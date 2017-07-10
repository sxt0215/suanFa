package com.example.sxt.suanfa;

/**
 * Created by Administrator on 2017/6/17.
 */

/**
 * ①斐波纳契数列（Fibonacci Sequence）
 * 问题描述：
 *    求解Fibonacci数列的第n个位置的值？（斐波纳契数列（Fibonacci Sequence），又称黄金分割数列，
 *    指的是这样一个数列：0、1、1、2、3、5、8、13、21、……在数学上，斐波纳契数列以如下被以递归的方法定义：
 *    F1=1,F2=1,Fn=F（n-1）+F（n-2）（n>2,n∈N*））。
 * */

public class Fibonacci {
    public static void main(String[] args) {
        Fibonacci fibonacci=new Fibonacci();
        int result=fibonacci.fib(5);
        System.out.println("递归方法："+result +"，该方法效率低");
        System.out.println( "for循环："+fibonacci.fib2(7)+"，");
    }

    //递归实现 有缺点;在这个递归里做了冗余的工作，
    // 我们在f4里面已经计算了f2，可是f3里有同样计算了f2，以此类推那些冗余的工作，在数值比较小的情况下，计算机还是可以接受的
    //但是，当求解的数值比较大，它是成指数级增长的，所以不要再递归中做重复的工作。
    public int fib(int index){
        if(index == 0){
            return 0;
        }if(index == 1){
            return 1;
        }else{
            return fib(index-1)+fib(index-2);
        }
    }
/**
 *  0、1、1、2、3、5、8、13、21、
 * 从下往上计算，首先计算f(0)和f(1）算出f(2),再根据f(1)和f(2）算出f(3)……依次类推就可以算出第n项了
 * 时间复杂度为O(n)
 * */
    public long fib2(int index){
        long reslut = 0;
        long preOne = 0;
        long preTwo = 1;
        if(index == 0)
            reslut = preOne;
        if(index == 1)
            reslut = preTwo;
        for(int i = 2; i < index; i++){
            reslut = preOne + preTwo;
            preOne = preTwo;
            preTwo = reslut;
        }
        return reslut;
    }



}
