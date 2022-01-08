package com.company.rcurssion;

public class sorted {
    static boolean fun(int []arr,int index){
        if(index==arr.length-1){
            return true ;
        }
        return arr[index]<arr[index+1] &&fun(arr,index+1);
    }

    public static void main(String[] args) {
        int[]arr={2,2,3,4,5,6};
        System.out.println(fun(arr,3));

    }
}
