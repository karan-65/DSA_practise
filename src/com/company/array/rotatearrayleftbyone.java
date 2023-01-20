package com.company.array;

import java.util.ArrayList;
import java.util.Arrays;
//so basically we store the first element and then pushed every element backward and then assinged temp to last
public class rotatearrayleftbyone {
    public static void rotate(int[]arr,int n){
        //stored the first element here
        int temp=arr[0];


        //pushed every element backward
        for(int i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        //and assinged first element to last
        arr[n-1]=temp;
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        rotate(arr,5);
    }
}
