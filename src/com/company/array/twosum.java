package com.company.array;

public class twosum {
    public  static void sum(int []arr,int target) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i]+arr[j]==target) {
                    System.out.println(i+" "+j);
                }
            }
        }

    }
    public static void main(String[] args) {
        int []arr={11,2,15,7};
        sum(arr,9);
    }
}
