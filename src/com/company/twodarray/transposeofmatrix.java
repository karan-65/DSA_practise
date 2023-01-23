package com.company.twodarray;

public class transposeofmatrix {
    public static void fun(int[][]arr){

        int arrr[][]=new int[arr[0].length][arr.length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arrr[j][i]=arr[i][j];
            }
        }

        for(int n=0;n<arrr.length;n++){
            for(int m=0;m<arrr[0].length;m++){
                System.out.print(arrr[n][m]);
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        fun(arr);
    }
}
