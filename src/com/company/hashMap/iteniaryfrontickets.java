package com.company.hashMap;
//main concept here is to find the start point
//that can be find  by getting the value that is not present in to(from) part


import java.util.HashMap;

public class iteniaryfrontickets {
    public static String getstart(HashMap<String,String>tickets){
        //we create a another hashmap that contains reverse key pair values
        HashMap<String,String>revmap=new HashMap<>();

        for(String i:tickets.keySet()){
            revmap.put(tickets.get(i),i);
        }

        for(String i:tickets.keySet()){
            if(!revmap.containsKey(i)){
                return i;
            }
        }

        return null;

    }

    public static void main(String[] args) {
        HashMap<String,String>hm=new HashMap<>();
        hm.put("chennai","bombay");
        hm.put("delhi","chennai");
        hm.put("bombay","chd");
        hm.put("chd","bengaluru");

        String start=getstart(hm);
        System.out.println(start);
        for(String s:hm.keySet()){
            System.out.println(hm.get(start));
            start=hm.get(start);
        }

    }
}
