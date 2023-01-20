package com.company.array;

public class minimumnumberofjumps {
     static int minJumps(int[] arr) {
         // your code here

         int count=1;
         int max=0;
         for(int i=0;i<arr.length;i++) {
                 i = i + arr[i];
             if(i<arr.length-1) {
                 count = count + 1;

             }else{
                 return count;
             }
         }
         return -1;
     }
    public static void main(String[] args) {
        int arr[] = {1, 4, 3, 2, 6, 7};
        System.out.println(minJumps(arr));
    }
}
