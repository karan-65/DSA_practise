package com.company.rcurssion;

public class dispplayarray {
    static void display(int[] arr,int idx){
        if(idx==arr.length){
            return;
        }
        System.out.println(arr[idx]);

        display(arr,idx+1);

    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        display(arr,0);

    }
}
