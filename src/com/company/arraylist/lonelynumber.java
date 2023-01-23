package com.company.arraylist;

import java.util.*;

public class lonelynumber {
    public static int fun(ArrayList<Integer>arr){
        Collections.sort(arr);
        ArrayList<Integer>ar=new ArrayList<>();
        for(int i=0;i<arr.size()-1;i++){
            if(arr.get(i-1)+1<arr.get(i)&&arr.get(i)+1<arr.get(i+1)){
               ar.add(arr.get(i));
            }
           if(arr.size()==1){
               return arr.get(0);
           }
        }
        return -1;
    }
    public static void main(String[] args) {
        ArrayList<Integer>arr=new ArrayList<>();
        arr.add(10);
        arr.add(6);
        arr.add(5);
        arr.add(8);

        System.out.println(fun(arr));
    }
}
