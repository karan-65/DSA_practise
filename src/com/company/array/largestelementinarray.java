package com.company.array;
//using the basic approacch that is creating the first element as  max variable and comparing it with all other
public class largestelementinarray {
    public static int largest(int[]arr){
        int temp=arr[0];
        for(int i=0;i<arr.length;i++){

            if(temp<arr[i]){
                temp=arr[i];
            }
        }
      return temp;
    }

    public static void main(String[] args) {
        int[]arr={112,4,113,1,15};
        System.out.println(largest(arr));
    }
}
