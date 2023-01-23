package com.company.twodarray;

public class printthenumber0f7 {
//    public static void fun(int[][]arr){
//        int count =0;
//        for(int i=0;i<arr.length;i++){
//            for(int j=0;j<arr[0].length;j++){
//                if(arr[i][j]==7){
//                    count++;
//                }
//            }
//        }
//        System.out.println(count);
//
//    }

    public static void fun(int[][]arr){
        int sum=0;
        for(int i=0;i<arr[0].length;i++){
                    sum=sum+arr[1][i];
            }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        fun(arr);
}
}
