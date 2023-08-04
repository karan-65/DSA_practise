package com.company;

public class practise2 {
    public static void fun(int[]arr1,int arr2[]){
        int sum=0;
        int maxsum=0;
        int i=0;
        int j=0;

        while(i<arr1.length&&j<arr2.length){
            sum=sum+arr1[i]-arr2[j];
            maxsum=Math.max(maxsum,sum);
            i++;
            j++;
        }
        System.out.println(maxsum);
    }
    public static void main(String[] args) {
        int[] arr={7,0,5,1,3};
        int []arr2={1,2,1,3,4};
        fun(arr,arr2);

    }
}
