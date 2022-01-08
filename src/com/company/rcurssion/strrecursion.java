package com.company.rcurssion;
//this function is for skipping a particular character in string

public class strrecursion {
    static void skip(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        if(ch=='a'){
            skip(p,up.substring(1));
        }
        else{
            skip(p + ch,up.substring(1));
        }
    }
    public static void main(String[] args) {
        String a="helaaalo world";
        skip("",a);

    }
}
