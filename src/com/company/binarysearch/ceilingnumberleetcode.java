package com.company.binarysearch;

public class ceilingnumberleetcode {
    public static int binarysearch(int []arr,int target){
        int start=arr[0];
        int end=arr.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;
        if(arr[mid]>target){
            end=mid-1;
        }
        else if (arr[mid]<target){
            start=mid+1;
        }
        else{
            return mid;
        }
    }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={-5,-3,-1,0,3,4,7,9};
        int ans=binarysearch(arr,5);
        System.out.println(ans);


    }
}
