package com.company.bubblesort;
//basically we are using divide and conquer technique here
//refer to apna college video
public class mergesort {
    public static void conquer(int[]arr,int si,int mid ,int ei){
        int merged[]=new int[ei-si+1];
        //this is tracking the first array
        int idx=si;
        //this is tracking the second array
        int idx2=mid+1;
        //this is tracking the merged array
        int x=0;

        while(idx<=mid&&idx2<=ei){
            if(arr[idx]<=arr[idx2]){
                merged[x]=arr[idx];
                x++;idx++;
            }
            else{
                merged[x]=arr[idx2];
                x++;idx2++;
            }
        }

        while(idx<=mid){
            merged[x]=arr[idx];
            x++;idx++;
        }

        while(idx2<=ei){
            merged[x]=arr[idx2];
            x++;idx2++;
        }
//this for loop is for copying the values into original array
        for(int i=0,j=si;i<merged.length;i++,j++){
            arr[j]=merged[i];
        }
    }

    public static void divide(int []arr,int si,int ei){
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;
        divide(arr,si,mid);
        divide(arr,mid+1,ei);
        conquer(arr,si,mid,ei);
    }
    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        int n=arr.length;
        divide(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();

    }
}
