package com.company.rcurssion.subsets;

public class subset {
    static void fun(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        fun(p + ch,up.substring(1));
        fun(p,up.substring(1));
    }

    public static void main(String[] args) {
        String s="abc";
        fun("",s);
    }
}
