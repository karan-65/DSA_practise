package com.company.hashMap;

import java.util.HashSet;

public class unionandintersection {
    public static void fun(int[]arr,int[]arrr){
        HashSet<Integer>hs=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            hs.add(arr[i]);
        }
        for(int i=0;i<arrr.length;i++){
            hs.add(arrr[i]);
        }
        System.out.println(hs.size());

        HashSet<Integer>hss=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            hss.add(arr[i]);
        }
        for(int i=0;i<arrr.length;i++){
           if(hss.contains(arrr[i])){
               System.out.println(arrr[i]);
               hss.remove(arrr[i]);
           }
        }


    }
    public static void main(String[] args) {
        int arr[]={2,3,4};
        int arrr[]={2,5,6};
        fun(arr,arrr);
    }
}
