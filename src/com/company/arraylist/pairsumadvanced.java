package com.company.arraylist;

import java.util.ArrayList;
//it is given rotated sorted array
//modulo is the main game here
//approach is same
public class pairsumadvanced {
    public static boolean sum(ArrayList<Integer>arr,int target){
        int max=0;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)>arr.get(i+1)){
                max=i;
                break;
            }
        }
        int right=max;
        int left=right+1;
        while(left!=right){
            if(arr.get(left)+arr.get(right)==target){
                return true;
            }
            if(arr.get(left)+arr.get(right)>target){
                right=(arr.size()+right-1)%arr.size();
            }
            else{
                left=(left+1)%arr.size();
            }
        }
        return false;

    }
    public static void main(String[] args) {
        ArrayList<Integer>arr=new ArrayList<>();
        arr.add(11);
        arr.add(15);
        arr.add(16);
        arr.add(8);
        arr.add(9);
        arr.add(10);

        System.out.println(sum(arr,24));
    }
}
