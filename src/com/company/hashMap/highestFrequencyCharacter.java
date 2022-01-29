package com.company.hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class highestFrequencyCharacter {
    public static void fun(String s){
        int nf=0;
        HashMap<Character,Integer>hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(hm.containsKey(ch)){
                int of=hm.get(ch);
                 nf=of+1;
                hm.put(ch,nf);
            }
            else {
                hm.put(ch,1);
            }
        }
        Set<Character> set = hm.keySet();
        Iterator<Character> iterator = set.iterator();
        while(iterator.hasNext()){
            char key = iterator.next();
            //check count
            if(hm.get(key)==nf){
                System.out.println("Character: " + key + " has occurred maximum times in String:  " +  nf);
            }
        }
    }
    public static void main(String[] args) {
        String s="abcdcdcddd";
        fun(s);

    }

}
