package com.company.twodarray;

public class diagonalsum {
    //calculating the sum of diagonals of matrix
    //this one done here is optimized approach
    public static void fun(int[][]arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i][i];
            if(i!=arr.length-i-1){
                sum=sum+arr[i][arr.length-1-i];
            }
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        fun(arr);
    }
}
