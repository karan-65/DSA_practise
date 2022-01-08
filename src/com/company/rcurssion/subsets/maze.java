package com.company.rcurssion.subsets;

public class maze {
    static void fun(String p,int r,int c){
        if(r==1&&c==1){
            System.out.println(p);
            return;
        }
        if(r>1){
            fun(p +'D',r-1,c);
        }
        if(c>1){
            fun(p +'R',r,c-1);
        }
    }

    public static void main(String[] args) {
        fun("",3,3);

    }
}
