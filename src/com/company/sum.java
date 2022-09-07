package com.company;

import java.util.Scanner;

public class sum {
    public static void sort(int[]arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]%2==0){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,8,0,7};
        sort(arr);

}
}
