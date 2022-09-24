package com.company.array;

import java.util.Arrays;

public class mimimizetheheight {
    public static int getMinDiff(int[] arr, int n, int k) {
//geeks for geeks problem
        //medium level you can solve it take your time ti think it
        Arrays.sort(arr);

        int diff=arr[n-1]-arr[0];
        int max=arr[0];
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]-k<0) continue;
            max=Math.max(arr[i-1]+k,arr[n-1]-k);
            min=Math.min(arr[0]+k,arr[i]-k);

            diff=Math.min(diff,max-min);
        }
        return diff;
    }
    public static void main(String[] args) {
        int Arr[] = {3, 9, 12, 16, 20};
        System.out.println(getMinDiff(Arr,5,3));
    }
}
