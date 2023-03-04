package com.company.array;
import java.util.Arrays;

//leetcode 128
public class longestconsecutivesequence {
    public static int  fun(int[]arr){
        int count=0;
        Arrays.sort(arr);
        int max=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]-arr[i-1]==1){
                count++;
                max=Math.max(max,count);
            }
            else{
                count=1;
            }
        }
        return max;

    }
    public static void main(String[] args) {
        int []arr={1,2,3,5,6,7,8,9};
        System.out.println(fun(arr));

    }
}
