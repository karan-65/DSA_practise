package com.company.arraylist;

import java.util.ArrayList;

public class pairsum {
    //brute force by calculating all pairs that exists
//    public static void sum(ArrayList<Integer>arr,int target){
//
//        for(int i=0;i<arr.size();i++){
//            for(int j=i+1;j<arr.size();j++){
//                if(arr.get(i)+arr.get(j)==target){
//                    System.out.println(i +" "+j);
//                }
//            }
//        }
//    }

    //optimised appproach that gives On
    //using 2 pointers here

    public static boolean sum(ArrayList<Integer>arr,int target){
        int left=0;
        int right=arr.size()-1;
        while(left<right){
            if(arr.get(left)+arr.get(right)==target){
                return true;
            }
            if(arr.get(left)+arr.get(right)<target){
                left++;
            }
            else {
                right--;
            }
        }
        return false;
    }



    public static void main(String[] args) {
        ArrayList<Integer>arr=new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        System.out.println(sum(arr,55));

    }
}
