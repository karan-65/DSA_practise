package com.company.bubblesort;

import java.util.Arrays;
//insertion sort basically is sorting array in pair like first elemnent then next two and so on
//apna college video for reference

public class insertionsort {
    public static void insertion(int[]arr){
       for(int i=1;i<arr.length;i++){
           int current=arr[i];
           int j=i-1;
           while(j>=0&&current<arr[j]){
               arr[j+1]=arr[j];
               j--;
           }

           arr[j+1]=current;
       }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int arr[]={4,1,6,3,2};
       insertion(arr);
    }
}
