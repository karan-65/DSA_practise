package com.company.rcurssion;

public class digitsum {
    static int digitsum(int n){
        if(n==0){
            return 0;
        }
        return n%10 + digitsum(n/10);
    }
    public static void main(String[] args) {

        System.out.println(digitsum(1342));
    }
}
