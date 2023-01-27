package com.company.hashMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class majorityelement {
    public static void fun(int[]arr){
        HashMap<Integer,Integer>hm=new HashMap<>();

        for(int i=0;i<arr.length;i++){
           int num=arr[i];
           if(hm.containsKey(num)){
               hm.put(num,hm.get(num)+1);
           }
           else {
               hm.put(num, 1);
           }
        }
        Set<Integer>s=hm.keySet();
        for(Integer i:s){
            if (hm.get(i)>arr.length/3) {
                System.out.println(i);
            }
        }

    }
    public static void main(String[] args) {
        int arr[]={1,2,1,2,1,1,3,4,5};
        fun(arr);

    }
}
