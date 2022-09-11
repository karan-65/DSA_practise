package com.company.rcurssion;

public class towerofhanoi {
    public static void tower(int n,char a,char b,char c){
        if(n==1){
            System.out.println(a +"to"+c);
            return;
        }

        tower(n-1,a,c,b);
        System.out.println("move from "+ a+"to"+c);
        tower(n-1,b,a,c);

    }
    public static void main(String[] args) {

       tower(61,'a','b','c');

    }
}
