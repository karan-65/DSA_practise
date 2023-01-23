package com.company.twodarray;

public class searchinsortedmatrix {
    public static boolean fun(int [][]arr,int key){
        int i=0;
        int j=arr[0].length-1;
        while (i<arr.length && j>=0) {
            if(arr[i][j]==key){
                return true;
            }
            else if (key>arr[i][j]){
                i++;
            }
            else {
                j--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(fun(arr,62));
    }
}
