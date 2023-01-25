package com.company.String;

import java.util.Arrays;
import java.util.Locale;

public class anagram {
    public static void fun(String s1,String s2){

        if(s1.length()==s2.length()){
            char[]ch1=s1.toCharArray();
            char[]ch2=s2.toCharArray();

            Arrays.sort(ch1);
            Arrays.sort(ch2);

            boolean result=Arrays.equals(ch1,ch2);

            if(result){
                System.out.println("are anagram");;
            }
            else {
                System.out.println("not anagram");
            }

        }
        else {
        System.out.println("not anagram");
        }
    }
    public static void main(String[] args) {
        String s="race";
        String e="care";
        fun(s,e);

    }
}
