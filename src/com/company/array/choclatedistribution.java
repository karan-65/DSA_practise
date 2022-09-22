package com.company.array;

import java.util.Arrays;
//just sort it and you we will get the approach
public class choclatedistribution {
    public static void fun(int []arr,int m,int n){
        Arrays.sort(arr);

        int ans=Integer.MAX_VALUE;
        for(int i=0;i<n-m;i++){
            int min=arr[i];
            int max=arr[i+m-1];
            int diff=max-min;
            if(diff<ans){
                ans=diff;
            }

        }
        System.out.println(ans);
    }

    public static void main(String[] args) {

        int[] arr = {7, 3, 2, 4, 9, 12, 56};
        fun(arr,3,7);

    }
}
