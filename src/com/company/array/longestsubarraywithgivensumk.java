package com.company.array;

public class longestsubarraywithgivensumk {
    //this one is the brute force approach
    //try to solve it your self this will automatically hit your mind it is easy

    public static int subarray(int[]arr,int k){
        int maxlength=0;
        for(int i=0;i<arr.length;i++){
            //sum variable to calculate the value of sum each time after for loop
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum=sum+arr[j];
                if(sum==k){
                    maxlength=Math.max(maxlength,(j-i+1));
                }
            }
        }
        return maxlength;

    }
    public static void main(String[] args) {
        int []arr={2,3,5,1,9};
        System.out.println(subarray(arr,10));

    }
}
