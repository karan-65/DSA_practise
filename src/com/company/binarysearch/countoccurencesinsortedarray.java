package com.company.binarysearch;

public class countoccurencesinsortedarray {
    public static int binarysearch(int []arr,int x){
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(x==arr[mid]){
               return mid;
            }
            else if(x>arr[mid]){
                s=mid+1;
            }
            else {
                e=mid-1;
            }
        }
        return -1;
    }
    public static int count(int[]arr,int x){
        int idx=binarysearch(arr,x);
        int k=1;
        int left=idx-1;
        while(left>=0&&arr[left]==x){
            k++;
            left--;
        }

        int right=idx+1;
        while(right<arr.length&&arr[right]==x){
            k++;
            right++;
        }
        return k;
    }
    public static void main(String[] args) {
        int n = 7;
        int x = 3;
        int[] arr = {2,2,3,3,3,3,4};

        int ans = count(arr, x);

        System.out.println(x+" occurs "+ans+" times in the array");
    }
}
