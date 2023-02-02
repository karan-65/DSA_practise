package com.company.hashMap;

import java.util.HashMap;

public class subarraysumequaltoK {

    //this one is brute force using two for loops and calulating the count
//    public static void fun(int[]arr){
//        int count=0;
//
//        for(int i=0;i<arr.length;i++){
//            int sum=0;
//            for(int j=i;j<arr.length;j++){
//                sum=sum+arr[j];
//                if(sum==3){
//                    count++;
//                }
//            }
//        }
//        System.out.println(count);
//    }

    //bhai note book dekh or video bhi bhenchod concept he yeh
    public static void main(String[] args) {
        int arr[]={1,2,3};
        int k=3;

        HashMap<Integer,Integer>hm=new HashMap<>();
        hm.put(0,1);
        int ans=0;
        int sum=0;
        for(int j=0;j<arr.length;j++){
            sum+=arr[j];
            if(hm.containsKey(sum-k)){
                ans+=hm.get(sum-k);
            }

                hm.put(sum,hm.getOrDefault(sum,0)+1);

        }
        System.out.println(ans);

    }
}
