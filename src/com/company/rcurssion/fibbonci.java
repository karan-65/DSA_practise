package com.company.rcurssion;

public class fibbonci {
    static int fib(int a){
        // base condition
        if(a<2){
            return a;
        }
        return fib(a-1) + fib(a-2);
    }
    public static void main(String[] args) {
        System.out.println(fib(4));

    }
}
