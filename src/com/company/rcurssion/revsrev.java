package com.company.rcurssion;

public class revsrev {
    static void revfun(int n){
        if(n==0){
            return;
        }
        revfun(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        revfun(6);

    }
}
