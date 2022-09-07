package com.company.bubblesort;

import java.util.Arrays;

public class selectionsort {
    public static void selection(int[]arr){
        //selection sort the basic concept here is select the smallest element in the array
        //and bring it ahead
        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min]>arr[j]){
                    min=j;

                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;


        }

        System.out.println(Arrays.toString(arr));

    }
    public static void main(String[] args) {
        int arr[]={4,1,6,3,2};
        selection(arr);

    }
}
