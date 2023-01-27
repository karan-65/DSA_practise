package com.company.hashMap;

import java.util.HashMap;

public class anagrams {
    public static boolean fun(String s1,String s2){
        HashMap<Character,Integer>hm=new HashMap<>();
        for(int i=0;i<s1.length();i++){
            char num= s1.charAt(i);
            if(hm.containsKey(num)){
                hm.put(num,hm.get(num)+1);
            }else {
                hm.put(num,1);
            }
        }

        for(int i=0;i<s2.length();i++){
            char ch=s2.charAt(i);
            if(hm.get(ch)!=null){
                if(hm.get(s2.charAt(i))==1){
                    hm.remove(s2.charAt(i));
                }
                else {
                    hm.put(s2.charAt(i),hm.get(s2.charAt(i))-1);
                }
            }else {
                return false;
            }
        }
        return hm.isEmpty();
    }
    public static void main(String[] args) {
        String s="racee";
        String d="care";
        System.out.println(fun(s,d));

    }
}
