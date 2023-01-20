package com.company.arraylist;

import java.util.ArrayList;

public class containerwithmostwater {
//brute force approachh usinng 2 loops
    //tc of on2

//    public static void fun(ArrayList<Integer>arr){
//        int max=0;
//        for(int i=0;i<arr.size();i++){
//            for(int j=i+1;j<arr.size();j++){
//                int height=Math.min(i,j);
//                int width=j-i;
//                int area=height*width;
//                max=Math.max(area,max);
//            }
//
//        }


    //this one is optimised
    //On
    //using two pointers approach
    public static int fun2(ArrayList<Integer>arr){
        int left=arr.get(0);
        int right=arr.size()-1;
        int max=0;
        while(left<right){
               int height=Math.min(arr.get(left),arr.get(right));
               int width=right-left;
                int area=height*width;
                max=Math.max(area,max);
                if(arr.get(left)<arr.get(right)){
                    left++;
                }
                else{
                    right--;
                }
        }
        return max;
    }
    public static void main(String[] args) {
        ArrayList<Integer>arr=new ArrayList<>();
        arr.add(1);
        arr.add(8);
        arr.add(6);
        arr.add(2);
        arr.add(5);
        arr.add(4);
        arr.add(8);
        arr.add(3);
        arr.add(7);
        System.out.println(fun2(arr));
    }
}
