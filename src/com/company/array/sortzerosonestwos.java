package com.company.array;

import java.util.Arrays;

public class sortzerosonestwos {
    public static void sort012(int arr[], int n)
    {

        for(int i=0;i<arr.length;i++){
            int min=0;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }

        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {1, 2,0,0,2,1};
        sort012(arr,5);

    }
}
