package com.company.twodarray;

public class maximum {
    public static int  max(int arr[][]){
        int max=0;

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]>max){
                   max=arr[i][j];
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(max(arr));


    }
}
