package com.company.binarysearch;

public class ceilingnumberleetcode {
    //binary search algo
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
    public static int cieling(int []arr,int target){
        //ceiling means the smallest number greater from target
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
        //here is the only change from binary search

        return start;
    }
    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,19};
        int ans=cieling(arr,15);
        System.out.println(ans);


    }
}
