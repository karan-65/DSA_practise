package com.company.rcurssion;

import java.util.ArrayList;
//watch strivers video for detail
public class cobinationsum {

    //this fun has the main logic
    private void fun(int target,ArrayList<ArrayList<Integer>>ds,ArrayList<Integer>a,int[]arr,int idx){

        if(idx==arr.length){
            if(target==0){
                ds.add(new ArrayList<>(a));

            }
            return;
        }

// so approach here shows that we have to pick and not pick
        //when we dosent pick the index remians the same
        //when we pick the index increases
        if(arr[idx]<=target){
            a.add(arr[idx]);
            fun(target-arr[idx],ds,a,arr,idx);
            a.remove(a.size()-1);
        }

        fun(target,ds,a,arr,idx+1);



    }
    public ArrayList<ArrayList<Integer>> combinationSum(int[] candidates, int target) {
        ArrayList<ArrayList<Integer>> ds=new ArrayList<>();
        fun(target,ds,new ArrayList<>(),candidates,0);
        return ds;
    }
    public static void main(String[] args) {

    }
}
