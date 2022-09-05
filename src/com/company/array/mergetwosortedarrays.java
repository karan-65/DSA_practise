package com.company.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class mergetwosortedarrays {

    public static void sort(int []arr1,int []arr2){
      for(int i=0;i<arr1.length;i++){
         if(arr1[i]>arr2[0]){
             int temp=arr1[i];
             arr1[i]=arr2[0];
             arr2[0]=temp;
         }
          Arrays.sort(arr2);
      }

        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            System.out.println(arr2[i]);
        }

    }

    public static void main(String[] args) {
        int arr[]={1,3,5,7};
        int arr1[]={2,4,6};
        sort(arr,arr1);

    }
}
