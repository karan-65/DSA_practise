package com.company.rcurssion;
//this function is for skipping a particular string in a string

public class strrecurssion {
    static void fun(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        if (up.startsWith("apple")) {
             fun(p,up.substring(5));
        }
        else{
            fun(p +up.charAt(0),up.substring(1));
        }
    }
    public static void main(String[] args) {
        String s="baccappledh";
        fun("",s);

    }
}
