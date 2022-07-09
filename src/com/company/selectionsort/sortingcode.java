package com.company.selectionsort;

import java.util.Arrays;
//gfg
public class sortingcode {
    public static void sort(int[]arr){
        for(int i=0;i<arr.length-1;i++){
            int minindex=i;
            for(int j=i+1;j<arr.length-1;j++){
                if(arr[j]<arr[minindex]){
                    minindex=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minindex];
            arr[minindex]=temp;

        }
    }
    public static void main(String[] args) {
        int[]arr={2,5,1,2,3,6,4};
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
