package com.company.binarysearch;

public class searchinrotatedarray {
    public static int search(int[]arr,int target){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=high+(low-high)/2;
            if(arr[mid]==target)
                return mid;

            if(arr[low]<=arr[mid]){
                if(target>=arr[low]&&target<=arr[mid]){
                    high=mid-1;
                }
                else {
                    low=mid+1;
                }
            }
            else{
                if(target>=mid&&target<=high){
                    low=mid+1;
                }
                else {
                    high=mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={3,4,5,6,1,2};
        System.out.println(search(arr,4));

    }
}
