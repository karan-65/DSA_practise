package com.company.rcurssion.subsets;

public class permutation {
    static void fun(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        for(int i=0;i<=p.length();i++){
            char ch=up.charAt(0);
            String s=p.substring(0,i);
            String q=p.substring(i,p.length());
            fun(s+ch+q,up.substring(1));
        }
    }

    public static void main(String[] args) {
        fun("","abc");

    }
}
