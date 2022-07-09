package com.company.bubblesort;

import java.util.Arrays;
//kunal and gfg course
public class sortingcode {
    public static void sort(int[]arr){
        for(int i=0;i<arr.length-2;i++){
            //these condition is to improve the efficeiency
            for(int j=0;j< arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int []arr={3,2,5,1,6};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
