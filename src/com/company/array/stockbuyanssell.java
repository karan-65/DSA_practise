package com.company.array;

import java.util.Arrays;

public class stockbuyanssell {
    public static int stock(int[]arr){
        //this is brute force approach
//        int max=0;
//      for(int i=0;i<arr.length;i++){
//          for(int j=i+1;j<arr.length;j++){
//              if(arr[j]>arr[i]){
//                  max=Math.max(arr[j]-arr[i],max);
//
//              }
//
//          }
//      }
//
//      return max;

        //this is the optimal solution
        //this is easay question try urself
        int min=arr[0];
        int max=0;
        for(int i=0;i<arr.length;i++){
            min=Math.min(min,arr[i]);
            max=Math.max(max,arr[i]-min);
        }
        return max;

        }



    public static void main(String[] args) {
        int arr[]={8,1,6,3,2};
        System.out.println(stock(arr));
    }
}
