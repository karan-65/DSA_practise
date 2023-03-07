package com.company.array;

public class removeelement {
    public static int fun(int[]arr,int val){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=val){
                arr[count]=arr[i];
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int []arr={1,2,3,41,2,3,3,20};
        System.out.println(fun(arr,3));

    }
}
