package com.company.array;

import java.sql.SQLOutput;
import java.util.Arrays;

public class sortzerosonestwos {
    public static void sort012(int arr[], int n)
    {

        int count=0;
        int count1=0;
        int count2=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                count++;
            }
            if(arr[i]==1){
                count1++;
            }
            if(arr[i]==2){
                count2++;
            }
        }

        int i=0;

        while(i<arr.length){
            while(count!=0){
                arr[i]=0;
                i++;
                count--;
            }
            while(count1!=0){
                arr[i]=1;
                i++;
                count1--;
            }
            while(count2!=0){
                arr[i]=2;
                i++;
                count2--;
            }

        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {1, 2,0,0,2,1};
        sort012(arr,5);

    }
}
