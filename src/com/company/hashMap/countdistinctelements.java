package com.company.hashMap;

import java.util.HashSet;

public class countdistinctelements {
    public static void main(String[] args) {
        int arr[]={2,3,4,5,3,2,2,1,6};
        HashSet<Integer>h=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            h.add(arr[i]);
        }
        System.out.println(h.size());
    }
}
