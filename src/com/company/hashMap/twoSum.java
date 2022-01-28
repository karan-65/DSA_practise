package com.company.hashMap;

import java.util.HashMap;

public class twoSum {
    public static int[] fun(int[] arr, int target){
        // we will store result in array as we have to return two index
        int[]res=new int[2];
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(hm.containsKey(target-arr[i])){
                res[1]=i;

                res[0]=hm.get(target-arr[i]);
            }
            hm.put(arr[i],i);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr={1,5,7,3,8};
        for(int x : fun(arr , 15))
            System.out.print(x + " ");


    }
}
