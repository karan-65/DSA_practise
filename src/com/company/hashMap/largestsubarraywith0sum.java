package com.company.hashMap;

import java.util.HashMap;

public class largestsubarraywith0sum {
    //this one is th ebrute force approach
//    public static void fun(int[]arr){
//        int m=0;
//
//        for(int i=0;i<arr.length;i++){
//            int sum=0;
//            for(int j=i;j< arr.length;j++){
//                sum+=arr[j];
//                if(sum==0){
//                    int max=j-i+1;
//                    m=Math.max(max,m);
//
//                }
//
//            }
//
//        }
//        System.out.println(m);
//
//    }

    public static  void fun(int []arr){
        HashMap<Integer,Integer>hm=new HashMap<>();
        int sum=0;
        int len=0;
        for(int i=0;i<arr.length;i++){
             sum=sum+arr[i];
            if(hm.containsKey(sum)){
                len=Math.max(len,i-hm.get(sum));
            }else {
                hm.put(sum,i);
            }
        }
        System.out.println(len);
    }

    public static void main(String[] args) {
        int []arr={15,-2,2,-8,1,7,10,23};
        fun(arr);


    }
}
