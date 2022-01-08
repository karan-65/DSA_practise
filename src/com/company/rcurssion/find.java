package com.company.rcurssion;

public class find {
    static boolean fun(int[] arr,int target,int index){
        if(index==arr.length){
            return false;
        }
        return arr[index]==target||fun(arr,target,index+1);
    }
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,5,4};
        System.out.println(fun(arr,4,0));

    }
}
